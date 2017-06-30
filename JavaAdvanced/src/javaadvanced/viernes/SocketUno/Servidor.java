
package javaadvanced.viernes.SocketUno;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException{
        System.out.println("Ventana Servidor");
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        
        String str = (String) dis.readUTF();
        System.out.println("Mensaje: "+ str);
        
        s.close();
        ss.close();
        
    }
}
