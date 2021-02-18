import java.util.Scanner;

class Moldura{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n Digite uma frase");
        String frase = ler.nextLine();  
        char barra = '\u2588';

        for(int i=0; i<frase.length() + 2; i++){
            System.out.print(barra);
        }
        System.out.println("\n"+barra+ frase +barra);
        for(int i=0; i<frase.length() + 2; i++){
             System.out.print(barra);
        }
    }
}