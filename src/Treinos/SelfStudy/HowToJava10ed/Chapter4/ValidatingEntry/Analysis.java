package Treinos.SelfStudy.HowToJava10ed.Chapter4.ValidatingEntry;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int  studentCounter = 0;


        while(studentCounter <= 10){

            System.out.println("Enter result (pass = 1, 2 = fail)");
            int result = input.nextInt();



          if (result == 1) {
              passes++;

             ++studentCounter;

          } else if(result ==2){
              failures++;

              ++studentCounter;
          }


            if (result != 1 && result != 2){
                System.out.println("Please enter a valid value (pass = 1, 2 = fail)");

               result = input.nextInt();

                --studentCounter;

            }



        }


        System.out.printf("The total amount of students who passed is %d \n" +
                        " the total who failed is of %d",
                passes, failures);

    }
}
