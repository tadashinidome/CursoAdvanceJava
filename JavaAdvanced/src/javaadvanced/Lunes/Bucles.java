/*
   Un lazo, es usado parqa iterar una parte del programa muchas veces.

    Hay 3 tipos de lazos en Java
    Simple For
    For-each
    Labeled For
 */
package javaadvanced.Lunes;

public class Bucles {
    public static void main(String[] args) {
        
        //simple For
        /*
          for(inizialization; condition; icnr/dec){
            lo  que sea
            }
        */        
        for(int i=1; i<=10; i++)
        {
            System.out.println("Iterando el elemento " + i);
        }
        
        //For each
        /*
          La estructura for each se utiliza para recorrer
          un arreglo o una coleccion en Java
        
          For(Type var: array){
            lo  que sea
            }        
        */          
        int arreglo[] = { 12,23,34,45,56,67};
        for(int a: arreglo){
            System.out.println("a");
        }
        
        //For Labeled
        aa:
        for(int i =1; i<= 3; i++){
            bb:
            for(int j = 1; j<= 3; j++){
                if(i == 2 && j== 2){
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
