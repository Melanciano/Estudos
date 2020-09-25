package Treinos.SelfStudy.HowToJava10ed.ChaptersGUI.chap3_6;
import javax.swing.JOptionPane;
public class Dialog1 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        String message = String.format("Bem vindo ao Java %s !", name);

        JOptionPane.showMessageDialog(null, message);


    }


}
