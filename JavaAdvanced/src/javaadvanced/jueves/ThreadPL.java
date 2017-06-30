/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
ThreadPool
Representa un grupo de hilos que estan
trabajando o esperan su turno para trabajar

Mejoran el rendimiento, por que no necesitan
crear multiples instancias.

*/



public class ThreadPL implements Runnable{

    private String msg;
    
    public ThreadPL(String s){
        msg = s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+
                    "(Start) msg = "+ msg);
        
        //call
        processMsg();
        System.out.println(Thread.currentThread().getName()+
                    "(End)");
        
    }
    
    private void processMsg(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }   
    
}

class PruebaPL{
    public static void main(String[] args) {
        ExecutorService excecutor = Executors.newFixedThreadPool(5);
        
        for(int i=0; i<10; i++){
            Runnable worker = new ThreadPL(" " + i);
            excecutor.execute(worker);
        }
        excecutor.shutdown();
        while(!excecutor.isTerminated()){}
        System.out.println("Todos los hilos se han terminado");
    }
}