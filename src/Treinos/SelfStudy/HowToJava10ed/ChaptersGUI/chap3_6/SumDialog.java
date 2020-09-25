package Treinos.SelfStudy.HowToJava10ed.ChaptersGUI.chap3_6;

import javax.swing.JOptionPane;

public class SumDialog {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "VAMOS FAZER UMA SOMA!");

        String num1 = JOptionPane.showInputDialog("Digite um numero");
        int numero1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Digite outro numero");
        int numero2 = Integer.parseInt(num2);


        JOptionPane.showMessageDialog(null, "Soma: " + (numero1 + numero2));


//        JOptionPane.showMessageDialog(null, "Eis o resultado da sua soma!"+num1+num2);

    }
}
