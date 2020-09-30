package Treinos.SelfStudy.HowToJava10ed.Chapter4.LargestNumber;

import java.util.Scanner;

/*Find the largest number in a 10 integer sequence;


initialize these variables: counter, number, largest;
*

processing: compare the number to the largest so far, update the counter in the loop

output: print the largest number after the loop ends
* */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number;
        int largest = 0;


        while( counter < 10) {
            System.out.println("Add another number to the list \n the program ends when the number count reaches 10");

            number = input.nextInt();

            if(number > largest) {
                largest = number;
            }

            counter++;


        }

        System.out.println("The largest number is: " + largest);



    }
}
