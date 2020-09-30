package Treinos.SelfStudy.HowToJava10ed.Chapter4.Squares;

import java.util.Scanner;

public class MakeSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linecounter = 1;
        int sizecounter = 1;
        System.out.println("How large do you want your square's size to be?");
        int size = input.nextInt();

        while (size > 20 || size < 1){
            System.out.println("Please select a number between 1 and 20");

            size = input.nextInt();
        }

if(size == 1){
    size++;
}

        String heightline = "*";
        String horizontalLine = "*";
        int makeLines = 1;

        // making top and bottom line
        while (sizecounter <= size - 1) {
            horizontalLine += "*";
            sizecounter++;
        }
        System.out.println(horizontalLine);


        // making vertical base line
        while (linecounter <= size) {
            heightline += " ";

            if (linecounter == size - 2)
                heightline += "*";
            linecounter++;
        }
        //making both vertical lines
        while (makeLines <= size-2) {
            System.out.printf("%s%n",heightline);
        makeLines++;
    }


        // making bottom line;
        System.out.println(horizontalLine);
    }


}
