
package javaadvanced.Martes.miercoles;

public class TestS extends Thread{
    
    @Override
    public void run(){
        for(int i = 1; i<5;i++)
        {
            try{                
            
                Thread.sleep(500);
                System.out.println(i);
                
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        TestS t1 = new TestS();
        t1.start();
        
        HiloS t2 = new HiloS();
        Thread th1 = new Thread(t2);
        th1.start();
    }
}


class HiloS implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<5;i++)
        {
            try{                
            
                Thread.sleep(500);
                System.out.println(i);
                
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
    
}