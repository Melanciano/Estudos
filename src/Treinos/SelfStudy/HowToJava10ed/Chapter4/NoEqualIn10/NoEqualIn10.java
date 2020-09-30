package Treinos.SelfStudy.HowToJava10ed.Chapter4.NoEqualIn10;

import java.util.Scanner;

public class NoEqualIn10 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number;
        int largest = 0;
        int largest2 = 0;
        int check = 0;
        int check2 = 0;
        int check3 = 0;
        int check4 = 0;

        while( counter < 10) {

            System.out.println("Add another number to the list \n the program ends when the number count reaches 10");

            number = input.nextInt();
            if(number == check || number  == check2 ||
                    number == check3 || number == check4){

                System.out.println("Please enter another value, \n no repeated numbers allowed, list wont end until numbers are unique");

                number = input.nextInt();
                counter--;
            }
            check = number;

            if(counter % 2 == 0){
                check4 = check2;
                check2 = number;
            } else if (check %2 != 0){
               check3 = check;
                check = number;
            }

            if(number > largest) {
                largest = number;
            } else if (number > largest2 && number < largest) {
                largest2 = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest + " and the second largest is " + largest2);

}
    }

