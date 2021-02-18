//calcula raiz quadrad

class CalculaRaizQuadrada{
    public static void main(String args[]){
        int numero = -10;
        if (numero > 0 ){
            double raiz = Math.sqrt(numero);
            System.out.println("/n Raiz quadrada de " + numero +" igual a "+ raiz);
        } 
        else{
            System.out.println("\n Somente sao aceitos numeros positivos");
        }
    }
} 