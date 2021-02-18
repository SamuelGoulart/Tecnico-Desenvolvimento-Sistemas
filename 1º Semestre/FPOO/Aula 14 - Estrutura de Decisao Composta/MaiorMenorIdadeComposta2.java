class MaiorMenorIdadeComposta2{
    public static void main(String args[]){
        int idade = 200;
        if(idade <1 || idade>110 ){ 
             System.out.println("\n idade invalida");
        }
        else{
             if(idade >=18 ){
                System.out.println("\n Voce eh maior de idade");
            }
            else{
                System.out.println("\n Voce eh menor de idade");
            }
        }
    }
}