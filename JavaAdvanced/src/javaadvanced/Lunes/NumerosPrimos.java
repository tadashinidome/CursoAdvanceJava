
package javaadvanced.Lunes;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean bPrimo;
        
        bPrimo = true;
        System.out.println("Intrdusca un numero:");
        num = input.nextInt();
        
        for(int i=(num - 1); i>1; i--){
            if((num % i) == 0){
                bPrimo = false;                
                break;
            }
        }
        
        if(bPrimo){
            System.out.println("Es primo");
        }
        //System.out.println((num % 1));
       /* if ((num % num) == 0) {
            //System.out.println("si");
            if( (num % 1) == 0){
                System.out.println(num  + " Es primo");
            }
        }*/
    }
}
