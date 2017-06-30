
package javaadvanced.viernes.socket3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class DReceiver {
    public static void main(String[] args) throws Exception{
        System.out.println("Servidor");
        DatagramSocket ds = new DatagramSocket(3000);
        byte []b= new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
