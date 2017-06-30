
package javaadvanced.viernes.socket3;

import java.net.InetAddress;

public class InetD {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del host: "+ ip.getHostName());
            System.out.println("Direccion ip: "+ ip.getHostAddress());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
