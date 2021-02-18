// Calcula a média artimética entre duas notas
import java.util.Scanner;

class Media{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");  
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) /2;

        System.out.println("\n Média: " + media);
        
    }
}