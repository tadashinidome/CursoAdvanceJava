/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes.POO;

import java.util.ArrayList;

/**
 *
 * @author CC-06
 */
public class Accion {
    public static void main(String[] args) {
        EjecutaAccion();
    }
    
    public static void EjecutaAccion(){
        ArrayList<String> Pasos = new ArrayList<String>();
        
     
        Elementos objElemn = new Elementos();
        objElemn.setNumElementos(6);
        objElemn.setNomElemento("Taza");
        objElemn.setNomElemento("cafe");
        objElemn.setNomElemento("agua");
        objElemn.setNomElemento("azucar");
        objElemn.setNomElemento("Arete");
        
        Pasos.add("agregar cafe");
        Pasos.add("agregar azucar");
        Pasos.add("agregr agua");
        Pasos.add("mesclar");
        
        PrepararCafe cafe = new PrepararCafe();
        cafe.setElementos(objElemn);
        cafe.setNumeroPasos(4);
        cafe.setDesPasos(Pasos);
        //cafe.setElemetos(objElemn);
        
        //cafe.getDesPasos();
        System.out.println(cafe.getDesPasos());
        System.out.println("El arete no se mojo por que aun no se agregaba el agua cuando cayo");
        
    }
}

class PrepararCafe{
    int numeroPasos;
    ArrayList<String> DesPasos = new ArrayList<String>();
    //ArrayList<Elementos> elemetos = new ArrayList<Elementos>();
    Elementos elementos;

    public Elementos getElementos() {
        return elementos;
    }

    public void setElementos(Elementos elementos) {
        this.elementos = elementos;
    }
   

    public int getNumeroPasos() {
        return numeroPasos;
    }

    public boolean setNumeroPasos(int numeroPasos) {
        if (numeroPasos > 0) {
            this.numeroPasos = numeroPasos;
            return true;
        }else{
            return false;
        }
        
    }

    public ArrayList<String> getDesPasos() {
        return DesPasos;
    }

    public void setDesPasos(ArrayList<String> DesPasos) {
        this.DesPasos = DesPasos;
    }

   
    
}

class Elementos{
    int numElementos;
    String nomElemento;

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public String getNomElemento() {
        return nomElemento;
    }

    public void setNomElemento(String nomElemento) {
        this.nomElemento = nomElemento;
    }
    
    
}


