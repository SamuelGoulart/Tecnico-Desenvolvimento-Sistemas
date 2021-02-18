import java.util.Scanner;
class Teste{
    public static void main(String args[]){
      Scanner ler = new Scanner(System.in);
      int i = 0;
      while(true){
          //Instruções para cadastar
          System.out.println("Continuar? [0 - Sim / 1 - Não]:");
          i = ler.nextInt();
          if(i == 1){
               break;
          }
      }// Fechamento do white
    }
}