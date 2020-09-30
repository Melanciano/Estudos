package Treinos.SelfStudy.HowToJava10ed.Chapter5.SellingProducts;
import java.util.Scanner;
public class SellingProducts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
        int sentinel = input.nextInt();

        double prodValue = 0;
        double total = 0;
        int qtd = 0;

        while(sentinel != -1 ) {
            System.out.println("Wich product type is to be sold? (from 1 to 5)" );
            String prodType = input.next().trim();

            switch (prodType){
                case "1":

                    prodValue = 2.98;
                    System.out.println("how many?");
                    qtd = input.nextInt();

                    total+= qtd * prodValue;
                    System.out.println("Subtotal: " + qtd * prodValue);

                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();

                    break;
                case "2":
                    prodValue = 4.50;
                    System.out.println("how many?");
                    qtd = input.nextInt();

                    total+= qtd * prodValue;
                    System.out.println("Subtotal: " + qtd * prodValue);

                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();

                    break;
                case"3":
                    prodValue = 9.98;
                    System.out.println("how many?");
                    qtd = input.nextInt();

                    total+= qtd * prodValue;
                    System.out.println("Subtotal: " + qtd * prodValue);

                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();

                    break;
                case"4":
                    prodValue = 4.49;
                    System.out.println("how many?");
                    qtd = input.nextInt();

                    total+= qtd * prodValue;
                    System.out.println("Subtotal: " + qtd * prodValue);

                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();

                    break;
                case"5":
                    prodValue = 6.87;
                    System.out.println("how many?");
                    qtd = input.nextInt();

                    total+= qtd * prodValue;
                    System.out.println("Subtotal: " + qtd * prodValue);

                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();

                    break;
                default:
                    System.out.println("No valid value inserted");
                    System.out.println("Do you wish to add a product to the sale? (y = 1; n = -1)");
                    sentinel = input.nextInt();


            }

        }
        if(total != 0){
            System.out.printf("The total value of the sale is of U$%.2f ", total);}









    }


}



