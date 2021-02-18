import javax.swing.JOptionPane;

class ParImpar{
   public static void main(String args[]){
       // Criando um objeto = jp
       // JOptionPane é uma classe
        JOptionPane jp = new JOptionPane();

         //nome do método
         String texto = jp.showInputDialog(null, "Digite um numero inteiro");
         int numero = Integer.parseInt(texto);

         if(numero % 2 ==0){
                  // jp = objeto
                 //showMessageDialog = método
                //Primeiro o objeto depois o método
                jp.showMessageDialog(null, numero+" e par");
         }else{
                jp.showInputDialog(null, numero+" e impar");
         }
   }
    
}