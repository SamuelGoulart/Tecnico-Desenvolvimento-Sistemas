class TrocaValores{
    public static void main(String args[]){
        int n1 = 10;
        int n2 = 4;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        int auxiliar = n1;
        n1 = n2;
        n2 = auxiliar;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }
}