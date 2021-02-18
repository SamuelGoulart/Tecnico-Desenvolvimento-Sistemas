//2. Para um número qualquer, informar se este é maior ou menor que dez, ou o próprio dez.
import java.util.Scanner;

class ex2 {
    public static void main(String args[]){
      Scanner ler = new Scanner(System.in);
      System.out.print("\t Iforme um numero: ");
      double numero = ler.nextDouble();

      if(numero != 10){
         if(numero > 10){
            System.out.println("\n \tO numero "+numero+" e maior que dez");
         }else{
            System.out.println("\n \tO numero "+numero+" e menor que dez");
         }
         
      }else{
         System.out.println("O numero "+numero+"e o proprio dez");
      }
    }
}

