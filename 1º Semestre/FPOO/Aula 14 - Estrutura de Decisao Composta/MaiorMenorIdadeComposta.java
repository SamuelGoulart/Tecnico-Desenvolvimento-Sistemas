/*
Informe se menor ou maior idade
faz validação da idade somente aceitando
se idade >=1 e idade <=110

*/

class MaiorMenorIdadeComposta{
    public static void main(String args[]){
        int idade = 50;
        if(idade >=1 && idade<=110){
            if(idade >=18){
               System.out.println("\n Voce eh maior de idade");
            }
            else{
                System.out.println("\n Voce eh menor de idade");
            }
        }
        else{
            System.out.println("\n Idade invalida");
        }
    }
}