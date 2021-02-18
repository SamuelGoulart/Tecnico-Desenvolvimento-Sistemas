//4. A partir de um número inteiro, informar se este é par ou ímpar.

import java.util.Scanner;

class ex4{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int numero =  ler.nextInt();

       if(numero % 2 == 0){
         System.out.print("O numero "+numero+" e par");
       }
       else{
         System.out.print("O numero "+numero+" e impar");
      }
    }
}