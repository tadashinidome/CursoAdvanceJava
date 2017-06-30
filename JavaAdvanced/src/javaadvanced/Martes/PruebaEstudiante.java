/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * @author CC-06
 */
public class PruebaEstudiante {
        //caso 5
        int dato = 5;

        public PruebaEstudiante() {
            Student s5 = new Student(this);
            s5.s();
        }      
        
    
        public static void main(String[] args) {
        Student s1 =  new Student(111, "Fer", "ITLeaon");
        Student s2 =  new Student(112, "Ara", "UG");
        Student s3 =  new Student(113, "Abril", "ITR");
        
        Student s4 =  new Student(114, "Abril", "ITR",10);
        
        /*s1.display();
        s2.display();
        s3.display();*/
        
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        
        //caso 4
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
        
        //caso 5
        PruebaEstudiante ps2 = new PruebaEstudiante();
        
        //caso 6
        new Student().getStudent().msg();
        
    }
        //caso 4
       void muestra(PruebaEstudiante obj){
           System.out.println("soy this");
       }
       
       //caso 4
       void despliega(){
           muestra(this);
       }
}
