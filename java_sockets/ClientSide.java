import java.io.*;
import java.net.*;

class ClientSide{

    public static void main(String[] args)throws IOException{

        Socket clientsocket = new Socket("localhost",12345);

        DataOutputStream dout = new
        DataOutputStream(clientsocket.getOutputStream());


        DataInputStream din = new 
        DataInputStream(clientsocket.getInputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String        str="";

        while(!str.equals("stop")){

             str = br.readLine();
            dout.writeUTF(str);
            System.out.println(din.readUTF());
//            dout.flush();

        }

        clientsocket.close();


    }





}
