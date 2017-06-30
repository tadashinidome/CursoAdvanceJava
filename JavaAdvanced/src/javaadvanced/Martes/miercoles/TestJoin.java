
package javaadvanced.Martes.miercoles;

public class TestJoin extends Thread{
    
    public void run()
    {
        for(int i=1; i<5; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
        t3.start();
    }
    
    //public static void show(TestJoin t1,...)
}
