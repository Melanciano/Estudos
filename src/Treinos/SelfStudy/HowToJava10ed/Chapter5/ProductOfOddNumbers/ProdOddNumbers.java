package Treinos.SelfStudy.HowToJava10ed.Chapter5.ProductOfOddNumbers;

public class ProdOddNumbers {
    public static void main(String[] args) {
        int product = 1;
 int counter = 1;
 while(counter <= 15){

     if(counter % 2 != 0){
         product *= counter;
     }

     counter++;
 }

        System.out.println("The product of odd numbers from 1 to 15 is: " + product);







    }
}
