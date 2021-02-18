/*

3. Para dois números, determinar qual é o maior entre eles imprimindo na tela ('O primeiro é
o maior' ou 'O segundo é o maior'). Caso sejam iguais, deve ser informado.

*/
class QualEMaiorOPrimeiroOuSegundo{
       public static void main(String args[]){
            double numero1 = 12;
            double numero2 = 10;

            if (numero1 > numero2){
                 System.out.println("O "+numero1+" e maior que o "+numero2);
            }
            else{
                System.out.println("O "+numero2+" e menor que o "+numero1);
            }
       }
}