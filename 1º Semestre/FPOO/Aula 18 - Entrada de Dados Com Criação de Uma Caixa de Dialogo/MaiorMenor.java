// Informar se um número é positivo, negativo ou o zero

import javax.swing.JOptionPane;

class MaiorMenor{
    public static void main(String args[]){
    //instância ou para criar um objeto da classe
    // ler = nome do objeto, logo ele é um objeto
        JOptionPane ler = new JOptionPane();
        // Só mostra uma mensagem
        // ler.showMessageDialog(null, "Digite um número");
        // Permite que o usuário insira dados
        String texto = ler.showInputDialog(null, "Digite um número: ");
        // criando uma várivel do tipo String
        double numero = Double.parseDouble(texto);

        if(numero > 0){
            ler.showMessageDialog(null, numero + " é positvo");
        }
        else{
            if(numero > 0){
               ler.showMessageDialog(null, numero + " é negativo");
            }else{
               ler.showMessageDialog(null, numero + " é o zero");
            }
        }
    }
}