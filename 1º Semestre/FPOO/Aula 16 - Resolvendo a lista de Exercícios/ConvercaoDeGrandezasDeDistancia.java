//7. A partir de um valor em metros, converta para km, hm, dam, dm, cm e mm.

class ConvercaoDeGrandezasDeDistancia{
    public static void main(String args[]){
        double metro = 1000;
        double km = metro /1000;
        double hm = metro / 100;
        double dam = metro / 10;
        double dm = metro / 0.1;
        double cm = metro / 0.01;
        double mm = metro / 0.001;
        System.out.println("\n" + metro+ " Corresponde a Quilometro : "+km );
        System.out.println("\n" + metro+ " Corresponde a Hectometros : "+hm );
        System.out.println("\n" + metro+ " Corresponde a Decametros: "+dam );
        System.out.println("\n" + metro+ " Corresponde a Decimetros: "+dm );
        System.out.println("\n" + metro+ " Corresponde a Centimetros: "+cm );
        System.out.println("\n" + metro+ " Corresponde a Milimetros: "+mm );


    }
}