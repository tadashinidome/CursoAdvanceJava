
package javaadvanced.jueves;
//Entendiendo el problema..muchos hilos uan tarea
public class Multitask extends  Thread{
    @Override
    public void run(){
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args) {
        Multitask t1 = new Multitask(),
                  t2 = new Multitask(),
                  t3 = new Multitask();
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class M implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea uno");
    }
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        
        TrueM tm1 = new TrueM();
        TrueMT tm2 = new TrueMT();
        
        tm1.start();
        tm2.start();
        
        t1.start();
        t2.start();
        
    }
    
    
}

class TrueM extends Thread{
    public void run(){
        System.out.println("Tarea A");
    }
}

class TrueMT extends Thread{
    public void run(){
        System.out.println("Tarea B");
    }
}