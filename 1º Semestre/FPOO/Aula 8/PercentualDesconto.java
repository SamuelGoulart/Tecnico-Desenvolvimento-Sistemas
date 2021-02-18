class PercentualDesconto{
    public static void main(String args[]){
        double valordacompra = 100;
        double percentualdedesconto= 20;
        double valorfinal = valordacompra - (valordacompra * percentualdedesconto /100);
        System.out.println("Uma compra de "+valordacompra+ " com desconto de "+percentualdedesconto+" o preco final fica em: "+valorfinal);
    }
}