import java.io.*;
import java.net.*;

class ServerSide{

    public static void main(String[] args) throws IOException{


        ServerSocket serversocket = new ServerSocket(12345);
        Socket s = serversocket.accept();
    String        val="";

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        while(!val.equals("stop")){


         val = (String)dis.readUTF();

        System.out.println(val);

        dout.writeUTF("received");
        }
    

        s.close();
        serversocket.close();


    }




}
