
package javaadvanced.jueves;

public class MultiR {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Taks one");
            }
        };
        
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Taks two");
            }
        };
        
        Thread T1 = new Thread(r1),
               T2 = new Thread(r2);
        
        T1.start();
        T2.start();
    }
    
}
