
import java.util.Scanner;

class ex8{
    public static void main(String args[]){
      Scanner peso1 = new Scanner(System.in);
      System.out.print("Informe o Peso: ");
      double peso = peso1.nextDouble();

      Scanner  altura1 = new Scanner(System.in);
      System.out.print("Informe sua altura: ");
      double altura = altura1.nextDouble();


      double imc = peso /  Math.pow(altura, 2);

        
      System.out.println("Seu imc e "+imc);

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