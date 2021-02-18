class CalculadoraDoIMC{
    public static void main(String args[]){
        double altura = 1.70;
        double peso = 50;
        double imc = peso /  Math.pow(altura, 2);

        System.out.println("\n Seu IMC: "+ imc);

         if (imc < 17) {
            System.out.println("\nMuito abaixo do peso.\n");
        }
        else if (imc >= 17 && imc < 18.5) {
            System.out.println("\nAbaixo do peso.\n");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("\nPeso normal.\n");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("\nAcima do peso.\n");
        }
        else if (imc >= 30  && imc < 35) {
            System.out.println("\nObesidade I.\n");
        }
        else if (imc >= 35 && imc < 40) {
            System.out.println("\nObesidade II (Severa).\n");
        }
        else {
            System.out.println("\nObesidade III (Morbida).\n");
        }
    }
}