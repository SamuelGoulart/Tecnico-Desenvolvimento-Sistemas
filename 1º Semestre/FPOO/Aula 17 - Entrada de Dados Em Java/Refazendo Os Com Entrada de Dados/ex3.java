//3. Para dois números, determinar qual é o maior entre eles imprimindo na tela (“O primeiro é
//o maior” ou “O segundo é o maior”). Caso sejam iguais, deve ser informado.
import java.util.Scanner;

class ex3{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informar o primeiro numero: ");
        double numero = ler.nextDouble();
        Scanner ler1 = new Scanner(System.in);
        System.out.print("Informe o segundo numero: ");
        double numero1 = ler1.nextDouble();

       if(numero != numero1){
          if(numero > numero1){
            System.out.println("\n O primeiro e o maior");
          }else{
           System.out.println("\n O segundo e o maior");
          }

        }else{
          System.out.print("\n Sao iguais");
        }
    }
}