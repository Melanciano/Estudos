package Treinos.SelfStudy.HowToJava10ed.Chapter4.TablePrint;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
 int goal;
        System.out.println("Until which multiplier do you wish to calculate the table of N?");
        goal = input.nextInt();

        System.out.println("N \t\t 10*N \t 100*N\t 1000*N" );

        while(counter <=goal ){

            System.out.printf("%d \t\t %d \t %d\t %d %n",counter * 1, counter * 10, counter * 100, counter * 1000 );
            counter++;

        }



    }
}
