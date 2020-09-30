package Treinos.SelfStudy.HowToJava10ed.Chapter5.PrintTriangles;

public class PrintTriangles {
    public static void main(String[] args) {

        System.out.println("Triangle 1");
// triangle 1
        int counter = 1;
        int i = 1;
        for (; counter <= 10; counter++){

            while( i <= counter){
                System.out.print("*");
                i++;
            }
            i = 1;
            System.out.println();


          }
        System.out.println("Triangle 2");

        // triangle 2;

        i = 10;
        counter = 1;
         for (; counter <= 10; counter++) {

             while (i >= counter) {
                 System.out.print("*");
             i--;
             }
             System.out.println();

             i = 10;
         }

        System.out.println("Triangle 3");
         // triangle 3;

        i = 10;
        counter = 1;
        for (; counter <= 10; counter++) {
        int j = 1;
            for(; j <= counter;  j++){
                System.out.print(" ");
            }

            while ( i >= counter){
                System.out.print("*");
                i--;
            }

            System.out.println();


            i = 10;

        }
        System.out.println("Triangle 4");

        // triangle 4;
         counter = 1;
         i = 1;

        for (; counter <= 10; counter++){

            int j = 10;
            while( j >= counter){
                System.out.print(" ");
                j--;
            }

            while( i <= counter){
                System.out.print("*");
                i++;
            }
            i = 1;
            System.out.println();


        }












    }
}


