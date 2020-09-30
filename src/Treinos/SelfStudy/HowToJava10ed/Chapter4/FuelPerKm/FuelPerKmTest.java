package Treinos.SelfStudy.HowToJava10ed.Chapter4.FuelPerKm;

import java.util.Scanner;

public class FuelPerKmTest {
    // Program: Calculate the amount of gas consumed per Km && output the total distance and consumption;

    //Input : ask the user for the variables to be initialized, inform about the sentinel value;
    // initialize integer variables kmDriven and gasConsumed; set the totalKM and totalGas  integer variables
    // to 0; also set the sentinel value to -1;

    /* Make a while loop using the sentinel value as a parameter;
   calculate and store in variables: the amount of km driven sum the amount of kmDriven to totalKm;
   , sum the amount of gas consumed to totalGas,
   calculate the  km per gas(L) ratio ;
 */
    //output: print and explain the results, also ask if the user wishes to insert  the sentinel value to add more info
    public static void main(String... args) {
        int totalKM = 0;
        int totalGas = 0;
        int sentinel = 0;
        java.util.Scanner input = new Scanner(System.in);
        while(sentinel != -1) {
            System.out.println("Please insert the driven distance in km ");
            int  kmDriven = input.nextInt();
            totalKM += kmDriven;

            System.out.println("Please insert the amount of gas consumed(L)");
            int gasConsumed = input.nextInt();
            totalGas += gasConsumed;

            double kmPerGas = kmDriven / gasConsumed;

            System.out.printf("the ratio of km driven per gas consumed is: %.2f%n", kmPerGas);

            System.out.printf("the total of gas consumed so far is of: %d%n", totalGas);
            System.out.printf("the total amount of km driven so far is of %d%n", totalKM);

            System.out.println("Do you wish to consult on another travel? (-1 to quit, any other  number to continue)");
            sentinel = input.nextInt();

        }

        System.out.printf("the total of gas consumed  is of: %d%n", totalGas);
        System.out.printf("the total amount of km driven is of %d", totalKM);



    }
}






