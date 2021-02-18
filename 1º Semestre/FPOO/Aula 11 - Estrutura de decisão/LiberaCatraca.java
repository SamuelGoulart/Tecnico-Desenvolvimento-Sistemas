// Algoritmo para transporte público

class LiberaCatraca{
    public static void main(String args[]){
        double creditoBilheteUnico = 25.85;
        double precoDaPassagem = 4.10;

        if ( creditoBilheteUnico >= precoDaPassagem){
            System.out.println("Catraca liberada");
            creditoBilheteUnico = creditoBilheteUnico - precoDaPassagem;
            System.out.println("Crédito atual: "+ creditoBilheteUnico);
        }
        else{
            System.out.println("Saldo insulfiente");
        }
    }
}