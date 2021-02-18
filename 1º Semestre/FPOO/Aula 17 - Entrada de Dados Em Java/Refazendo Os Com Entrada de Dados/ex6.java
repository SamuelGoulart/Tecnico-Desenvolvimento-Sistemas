//5. Informe se usuário é menor ou maior de idade.
//6. Idem ao anterior, porém, valide a idade, sendo que esta deve ser maior que zero e menor
//ou igual a 150.

import java.util.Scanner;

class ex6{
    public static void main(String args[]){
       Scanner ler = new Scanner(System.in);
       System.out.print("Infome a idade: ");
       int idade = ler.nextInt();

       if(idade < 1 || idade >150){
          System.out.println("\n Informe uma idade maior que zero e menor que 150");
       }
       else{
         if( idade > 17){
            System.out.println("\n Voce eh maior de idade");
         }
         else{
            System.out.println("\n Voce eh menor de idade");
         }
       }
    }
}