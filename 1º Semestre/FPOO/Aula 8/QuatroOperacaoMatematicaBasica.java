/* A partir de dois números decimais e efetuar as quatros operações matemáticas básicas,
apresentando ao final os resultados obtidos. 
*/
class QuatroOperacaoMatematicaBasica{
    public static void main(String args[]){
        double n1 = 10;
        double n2 = 15;
        double soma = n1 + n2;
        double sub = n1 - n2;
        double div = n1 /n2;
        double mult = n1  * n2;
        System.out.println("\t"+"O resultado da soma e: "+soma+"\n"+"\t"+"O resultado da subtracao e: "+sub+"\n"
        +"\t"+"O resultado da divisao e: "+div+"\n"+"\t"+"O resultado da multiplicacao e: "+mult);
    }
}