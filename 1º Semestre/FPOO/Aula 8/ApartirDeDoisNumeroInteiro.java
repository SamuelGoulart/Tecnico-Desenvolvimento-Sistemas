// 2.A partir de dois valores inteiros: 
class OperacoesMatematica{
    public static void main(String args[]){
        //2.1 Calcular e exibir a potência de cada um deles com expoente 5. 
        int n1 = 243;
        int n2 = 5;
        double potenciadon1 = Math.pow(n1,5);
        double potenciadon2 = Math.pow(n2,5);
        System.out.println("\n"+"O numero: "+n1+" elevado ao expoente 5 e: "+potenciadon1+
                           "\n"+"O numero: "+n2+" elevado ao expoente 5 e: "+ potenciadon2);

        //2.2 Calcular e exibir a divisão entre os inteiros guardando em uma variável int.
        int div = n1 / n2;
        System.out.println("\n"+"A Divisao entre: "+n1+" e "+n2+" e: "+div);

        //2.3 Calcular e exibir o módulo [resto da divisão entre dois inteiros]. 

        int resto = n1 % n2;
        System.out.println("\n"+"O Resto da divisao entre: "+n1+" e "+n2+" e: "+ resto);
        
        //2.4 Calcular e exibir a raiz quadrada de cada um deles.
        
        double raizn1 = Math.sqrt(n1);
        double raizn2 = Math.sqrt(n2);

        System.out.println("\n"+"A raiz quadrada de "+n1+" e: "+raizn1+
                           "\n"+"A raiz quadrada de "+n2+" e: "+raizn2);


 

    }
}