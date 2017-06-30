
package javaadvanced.viernes.socket3;

import java.net.MalformedURLException;
import java.net.URL;

public class URLD {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://codigofailito.com:8080/articulo");
            
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host: "+ url.getHost());
            System.out.println("Port: "+ url.getPort());
            System.out.println("File name: "+ url.getFile());
            
            
        } catch (MalformedURLException mur) {
            mur.printStackTrace();
        }
    }
}
