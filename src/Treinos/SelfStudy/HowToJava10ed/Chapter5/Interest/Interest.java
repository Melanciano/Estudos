package Treinos.SelfStudy.HowToJava10ed.Chapter5.Interest;

public class Interest {
    public static void main(String[] args){
        double amount;
        double principal = 1000;
        double rate =  0.05;

        System.out.printf("%s%20s %n", "Year", "Amount on Deposit");


        for(; rate <= 0.1; ) {

            System.out.println();
            System.out.print("rate: " + rate);

            for (int year = 0; year < 10; year++) {

                amount = principal * Math.pow(1 + rate, year);


                System.out.printf("%4d%,20.2f%n", year, amount);


            }
            rate += 0.01;
            if(rate > 0.09 && rate < 0.1){
                rate = 0.1;
            }
        }


    }
}
