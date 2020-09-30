package Treinos.SelfStudy.HowToJava10ed.Chapter5.SmallestValue;

import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many values to you wish to calculate?");
        int value = input.nextInt();
        int smallest = value;
        int number = 0;
        for(int i = 0; i < value; i++){

            System.out.println("insert a value to the list");
            number = input.nextInt();

            if(number <= value){
                smallest = number;
            }

        }

        System.out.println("the smallest number is: " + smallest);

    }

}
