
package javaadvanced.Lunes;

/**
 *
 * @author CC-06
 */
public class SerieFabunacci {
    public static void main(String[] args) {
        int a = 0, b= 1, c = 0;
        
        
        System.out.print(a);
        System.out.print(b);
       for(int i = 0; i<15; i ++)     
       {
           c= a + b;
           System.out.print(c);
           a=b;
           b=c;
       }
            
        
    }
}
