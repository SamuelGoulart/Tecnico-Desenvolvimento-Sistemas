class Moldura{
    public static void main(String args[]){
        String frase = "Bom dia DS1-M";
        char barra = '\u2588';         
        for (int i=0 ; i <frase.length() ; i = i + 1){
            System.out.println(barra);
        }
        System.out.println("\n" + frase);
    }
}
// Windows => Codificação  baseada na tabela ASCII [Latin I]


