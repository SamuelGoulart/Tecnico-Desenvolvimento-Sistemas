//Calcula o IMC e mostra o estado

import javax.swing.JOptionPane;

class imc2{
    // String é um objeto
    // java.lang
    public static void main(String args[]){

        JOptionPane jp = new JOptionPane();
        String txtPeso = jp.showInputDialog(null, "Informe seu peso: ");
        String txtAltura = jp.showInputDialog(null, "informe sua altura: ");

        double peso = Double.parseDouble(txtPeso);
        double altura = Double.parseDouble(txtAltura);

        double imc = peso /  Math.pow(altura,2);

        if(imc < 17){
              jp.showMessageDialog(null, "Muito abaixo do peso");
        }
        else{
            if(imc >=17 && imc<18.5){
               jp.showInputDialog(null, "Abaixo do peso");
            }
            else{
               if(imc >= 18.5 && imc<25){
                  jp.showInputDialog(null, "Peso ok");
               }
               else{
                   if(imc >= 30 && imc < 35){
                       jp.showInputDialog(null, "Obesidade I");
                   }
                   else{
                       if(imc >= 35 && imc < 40){
                          jp.showInputDialog(null, "Obesidade II - Severa");
                       }
                       else{
                          jp.showInputDialog(null, "Obesidade II - Morbida");
                       }
                   }
               }
            }
        }
    }
}