
package javaadvanced.viernes.SocketUno;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        try {
            System.out.println("Ventana Cliente");
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hola Sevidor");
            dout.flush();
            dout.close();
            s.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
