/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.banco2;

/**
 *
 * @author CC-06
 */
public class Banco {
    double getTasaDeIteres(){
        return 0;
    }
}

class Bancommer extends Banco{
    double getTasaDeIteres(){
        return 8.4;
    }
}

class HSBC extends Banco{
    double getTasaDeIteres(){
        return 7.3;
    }
}

class Bancoppel extends Banco{
    double getTasaDeIteres(){
        return 9.7;
    }
}

class TestP{
    public static void main(String[] args) {
        Banco b;
        
        b= new Bancommer();
        System.out.println("La tasa de interes "
                    + "de bancommer es: "+b.getTasaDeIteres());
        
        b= new HSBC();
        System.out.println("La tasa de interes "
                    + "de HSBC es: "+b.getTasaDeIteres());
        
        b= new Bancoppel();
        System.out.println("La tasa de interes "
                    + "de Bancoppel es: "+b.getTasaDeIteres());
    }
}

