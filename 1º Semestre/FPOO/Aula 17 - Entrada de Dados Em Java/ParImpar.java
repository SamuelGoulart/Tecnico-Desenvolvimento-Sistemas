//Informa se um número é par ou impar
import java.util.Scanner;

class ParImpar{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero = ler.Int();

        if (numero % 2 == 0){
        System.out.print("O numero e par: ");     
        }
        else{
        System.out.print("O numero e impar");
        }
    }
}