
package javaadvanced.Martes.Banco;


public class Banco {
    int getTazaDeInteres(){
        return 0;
    }
}

class Bancomer extends Banco{
    @Override
    int getTazaDeInteres(){
        return 8;
    }
}

class HSBC extends Banco{
    @Override
    int getTazaDeInteres(){
        return 7;
    }
}

class Bancoppel extends Banco{
    @Override
    int getTazaDeInteres(){
        return 9;
    }
}

class PruebaBanco {
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        Bancoppel bc = new Bancoppel();
        
        System.out.println("Bancommer taza de interes: "+
                b.getTazaDeInteres());
        System.out.println("HSBC taza de interes:" +
                h.getTazaDeInteres());
        System.out.println("Bancoppel taza de interes:" +
                bc.getTazaDeInteres());
    }
}