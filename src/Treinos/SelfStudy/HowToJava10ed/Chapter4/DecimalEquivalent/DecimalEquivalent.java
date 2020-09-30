package Treinos.SelfStudy.HowToJava10ed.Chapter4.DecimalEquivalent;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {


        System.out.println("Please enter the binary number you wish to convert from:");

        Scanner input = new Scanner(System.in);


        int number = input.nextInt();



        int temporary = 0;
        int result = 0;
        int initial = number % 10;
        number /= 10;


        while (String.valueOf(number).length() < 8 && number > 0) {
            result += initial;

            for (int i = 2; i <= 256; i *= 2) {
                temporary = number % 10;
                result += temporary * i;
                number /= 10;

            }
        }

        System.out.println(result);


}
}
