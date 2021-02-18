// 1. A partir de um número inteiro, informar se este é positivo, negativo ou zero.

import java.util.Scanner;

class ex1{
    public static void main(String args[]){
     Scanner ler = new Scanner(System.in);
     System.out.print("Informe um numero:");
     int numero = ler.nextInt();

     if(numero != 0){
         if(numero > 1){
            System.out.println("O "+numero+" e positivo");
         }else{
            System.out.println("O "+numero+" e negativo");
         }
     }else{
         System.out.println("E o zero ");
     }
    }
}