
package javaadvanced.Martes.miercoles.banco3;

public interface Bank {
    int getTasaInteres();
}

class HSBC2 implements Bank{

    @Override
    public int getTasaInteres() {
        return 8;
    }
    
}

class Bancommer2 implements Bank{

    @Override
    public int getTasaInteres() {
        return 7;
    }
    
}

class BanCoppel2 implements Bank{

    @Override
    public int getTasaInteres() {
        return 9;
    }
    
}

class LosBancos{
    public static void main(String[] args) {
        
        Bank HSBC = new HSBC2();
        Bank BanCom = new Bancommer2();
        Bank BanCop = new BanCoppel2();
        
        System.out.println("HSBC: "+
                HSBC.getTasaInteres());
        
        
        System.out.println("Bancommer: "+
                BanCom.getTasaInteres());
        
        
        System.out.println("Bancoppel: "+
                BanCop.getTasaInteres());
    }
}