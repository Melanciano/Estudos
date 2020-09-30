package Treinos.SelfStudy.HowToJava10ed.Chapter4;

public class Test {
    public static void main(String[] args)
    {
        double amount; // quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantidade inicial antes dos juros
        double rate = 0.05; // taxa de juros


        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year)
        {

            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
         }
}
