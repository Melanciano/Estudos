package Treinos.SelfStudy.HowToJava10ed.Chapter5.Factorial;

public class Factorial {
    public static void main(String[] args) {
        int counter = 1;
        long factorial = 1;
        while(counter <=20 ){

            factorial *= counter;
            counter++;
        }

        System.out.println("the factorial of 100 is: " + factorial);




    }
}
