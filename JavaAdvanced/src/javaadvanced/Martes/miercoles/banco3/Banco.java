
package javaadvanced.Martes.miercoles.banco3;


abstract class Banco {
    abstract int getTasaDeInteres();
}

class HSBC extends Banco{

    @Override
    int getTasaDeInteres() {
        return 7;
    }
    
}

class BanCoppel extends Banco{

    @Override
    int getTasaDeInteres() {
        return 9;
    }
    
}

class Bancommer extends Banco{

    @Override
    int getTasaDeInteres() {
        return 8;
    }
    
}

class PruebaBanco{
    public static void main(String[] args) {
        Banco b;
        
        b =  new HSBC();
        System.out.println("Tasa de interes: " +
                b.getTasaDeInteres());
        
        b =  new BanCoppel();
        System.out.println("Tasa de interes: " +
                b.getTasaDeInteres());
        
        b =  new Bancommer();
        System.out.println("Tasa de interes: " +
                b.getTasaDeInteres());
    }
}