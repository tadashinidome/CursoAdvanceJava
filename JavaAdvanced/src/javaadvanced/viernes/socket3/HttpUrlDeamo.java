
package javaadvanced.viernes.socket3;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class HttpUrlDeamo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.codigofacil.com");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            
            for (int i = 0; i < 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i)
                + " = "+huc.getHeaderField(i));
            }
 
            huc.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
