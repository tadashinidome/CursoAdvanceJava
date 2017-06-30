
package javaadvanced.jueves;
//Solved by my class anonimus
public class Multi extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Tarea uno");
            }
        };
        
         Thread t2 = new Thread(){
            public void run(){
                System.out.println("Tarea dos");
            }
        };
    }
    
        
    
}
