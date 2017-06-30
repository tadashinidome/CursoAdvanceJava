/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes;

/*
 La sentencia switch nos permite evaluar una declaración
 para multiples condiciones.

 Reemplazando a un if else anidado nivel 6
  
 */
public class SwitchSample {

    //psvm
    public static void main(String[] args) {
        int num = 20;
        char opc = 'a';
        
        switch(num){
            case 10:
                 System.out.println("10");
                 break;
            case 20:
                System.out.println("20");
                 break;
            case 30:
                 System.out.println("30");
                 break;
            default:
                System.out.println("No es 10, 20 o 30");
        } 
        
        switch(opc){
            case 'a':
                 System.out.println("a");
                 break;
            case 'b':
                System.out.println("b");
                 break;
            case 'c':
                 System.out.println("c");
                 break;
            default:
                System.out.println("opcion no registrada");
        }  
   }
}
