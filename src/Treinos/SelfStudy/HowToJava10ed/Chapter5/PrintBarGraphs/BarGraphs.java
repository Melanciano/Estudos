package Treinos.SelfStudy.HowToJava10ed.Chapter5.PrintBarGraphs;
import java.util.Scanner;
public class BarGraphs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String barGraph = "";
        for(int i = 1; i <= 5; i++){   // creating lines
            System.out.println("Digit a number for the bargraph");
            int number = input.nextInt();
            while(number < 1 ||  number > 30) {   // veryfing input value;
                System.out.println("Please insert a valid number");
                number = input.nextInt();
            }

            for (int j = 1; j <= number; j++){  //making the bar;
                barGraph += "*";
            }

            barGraph +="\n"; // creating another line in graph;

        }

        System.out.print(barGraph);



    }
}
