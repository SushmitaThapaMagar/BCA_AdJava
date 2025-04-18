package Cache;
import java.io.*;
import java.net.*;

public class SimpleCacheRequest extends CacheRequest{
    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    public OutputStream getBody() throws IOException{
        return out;
    }
    public void abort(){
        out.reset();
    }
    public byte[] getData(){
        if(out.size()==0) return null;
        else return out.toByteArray();
    }
}