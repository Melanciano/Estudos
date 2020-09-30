package Treinos.SelfStudy.HowToJava10ed.Chapter4.Palindrome;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey, check here if your 5 digit number is a palindrome or not!");
        int palindrome = input.nextInt();

        String palindromeString = String.valueOf(palindrome);

        if(palindromeString.length() != 5){
            System.out.println("please insert a 5 digit integer ");
        }

        String reverse = "";
        for (int i = palindromeString.length()-1; i >=0; i--){
            reverse += palindromeString.charAt(i);
        }


        if(palindromeString.equals(reverse)){
            System.out.println("Your number is a palindrome!!");
        } else {
            System.out.println("not a palindrome");
        }




    }

}
