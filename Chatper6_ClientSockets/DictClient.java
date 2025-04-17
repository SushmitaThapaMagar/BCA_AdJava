package Chatper6_ClientSockets;
import java.io.*;
import java.net.*;

public class DictClient { //class is public 
    //public is accessible from any class   //static is once class is initialized you dont need to make the object
    public static final String SERVER = "dict.org"; // variable define : final is not modifiable if once it's assigned 
    public static final int PORT = 2628; //variable define : integer type
    public static final int TIMEOUT = 15000; //timeout is in milliseconds

    
    // void -- got no return type 0r doesnot return any type
    public static void main (String[] args){ //main function : static --can be initialized without creating an object 

        Socket socket = null; //
        try{
            socket = new Socket(SERVER, PORT);
            socket.setSoTimeout(TIMEOUT); //socket timeout : if a client wants to connect in 15 seconds/15000 milliseconds
            OutputStream out = socket.getOutputStream(); 
            Writer writer = new OutputStreamWriter(out, "UTF-8");
            writer = new BufferedWriter(writer);

            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            for (String word: args){
                define(word, writer, reader);
            }
            writer.write("quit\r\n");
            writer.flush();
        }catch(IOException ex){ //IOException: Network/file operation failures
            System.err.println(ex);
        }finally{
            if(socket !=null){
                try{
                    socket.close();
                }catch(IOException ex){
                    //ignore
                }
            }
        }
    }

    static void define (String word, Writer writer, BufferedReader reader) throws IOException, UnsupportedEncodingException{
        writer.write("DEFINE eng-lat " + word + "\r\n");
        writer.flush();
        for (String line = reader.readLine(); line !=null; line=reader.readLine()){
            if(line.startsWith("250 ")){ //250: Success status code (ignores subsequent lines)
                return;
            }else if (line.startsWith("552")){ //552: "No match" status code
                System.out.println("No Definition found for" + word);
                return;
            }else if(line.matches("\\d\\d\\d.*")) continue; //3xx Codes: Continuation lines (ignored via regex \\d\\d\\d.*)
            else if (line.trim().equals(".")) continue;
            else System.out.println(line);
        }
    }
}
