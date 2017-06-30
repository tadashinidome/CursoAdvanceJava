
package javaadvanced.jueves;

public class ThreadT extends Thread{
    @Override
    public void run(){
        System.out.println("corriendo");
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThreadT t1 = new ThreadT(), t2 = new ThreadT(),
                    t3 = new ThreadT();
        
        System.out.println("El nombre del hilo: "+
                        t1.getName());
        System.out.println("El nombre del hilo: "+
                        t2.getName());
        System.out.println("El nombre del hilo: "+
                        t3.getName());
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo 1");
        t2.setName("Hilo 2");
        t3.setName("Hilo 3");
        
        System.out.println("El nombre del hilo: "+
                        t1.getName());
        System.out.println("El nombre del hilo: "+
                        t2.getName());
        System.out.println("El nombre del hilo: "+
                        t3.getName());
    }
}
