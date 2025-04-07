package Cache;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class MemoryCache extends ResponseCache{
    private final Map<URI, SimpleCacheRepsonse> responses = new ConcurrentHashMap<URI, SimpleCacheRepsonse>();
    private final int maxEntries;
    public MemoryCache(){
        this(100);
    }
    public MemoryCache(int maxEntries){
        this.maxEntries= maxEntries;
    }

    public CacheRequest put(URI uri, URLConnection conn) throws IOException{
        if(responses.size()>=maxEntries)
        return null;
        
        CacheControl control = new CacheControl(conn.getHeaderField("Cache-Control"));
        if(control.noStore()){
            return null;
        }
        else if (!conn.getHeaderField(0).startsWith("GET")){
            return null;
        }

        SimpleCacheRequest request = new SimpleCacheRequest();
        SimpleCacheRepsonse response = new SimpleCacheRepsonse();
        responses.put(uri, response);
        return request;
    }

    public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException{
        if ("GET".equals(requestMethod)){
            SimpleCacheResponse response = responses.get(uri);

            if (response != null&& response.isExpired()){
                responses.remove(response);
                response=null;
            }
            return response;
        } else{
            return null;
        }
    }
}
