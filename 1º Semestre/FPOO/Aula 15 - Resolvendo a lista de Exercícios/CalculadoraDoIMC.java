class CalculadoraDoIMC{
    public static void main(String args[]){
        double altura = 1.70;
        double peso = 130;
        double resultado = peso / (altura * altura);

        System.out.println("\n Seu IMC: "+ resultado);

        if( resultado >=1 && resultado <=29.99){
                if(resultado >=1 && resultado <=18.49){
                    if(resultado<=17){
                      System.out.println("Muito abaixo do peso");
                    }
                    else{
                      System.out.println("Abaixo do peso");
                    }
                } 
                else{
                    if(resultado <= 24.99){
                        System.out.println("Peso normal");
                    } 
                    else{
                        System.out.println("Acima do peso");
                    } 
               }
        }
        else{
            if(resultado <= 34.99){
                System.out.println("Obesidade 1");
            }
            else{
                if(resultado <= 39.99){
                    System.out.println("Obesidade II (severa)");
                }
                else{
                    System.out.println("Obesidade III (morbida)");
                }
            }
        }
    }
}