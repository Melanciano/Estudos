package Treinos.SelfStudy.HowToJava10ed.Chapter4.SalesCommission;
import java.util.Scanner;
public class Vendor {
    private String name;
    private int sentinel;
    private int totalItems = 0;
    private double totalValue = 0;
    private double itemValue;
    private double commissionTotal;
    private double resultSalary;





    public void calculateCommission() {

        Scanner input = new Scanner(System.in);
        System.out.println("do you wish to add an item to the vendor sales list? (yes(1),no(-1))");
        sentinel = input.nextInt();


        if(sentinel != 1 || sentinel != 1){
            System.out.println("Please insert an valid value (yes(1), no(-1))");
        return;
        }


        while (sentinel != -1 ) {

            ++totalItems;

            System.out.println("What is the item's value?");
            itemValue = input.nextDouble();

            totalValue += itemValue;

            System.out.println("Do you wish to add another item to the vendor sales list? (yes (1),  no (-1))");
            sentinel = input.nextInt();

        }

        if (totalItems > 0) {

            System.out.println("the total of items sold is of " + totalItems);

            System.out.println("the commission to be received this week by the vendor is of " + totalValue * 0.09);

            commissionTotal = totalValue * 0.09;
            resultSalary = 200 + commissionTotal;
            System.out.println("The value to be received by the vendor in total is of " + (resultSalary));

        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public int getSentinel(){
        return sentinel;
}

    public int getTotalItems() {
        return totalItems;
    }



    public double getTotalValue() {
        return totalValue;
    }



    public double getItemValue() {
        return itemValue;
    }

    public void setItemValue(double itemValue) {
        this.itemValue = itemValue;
    }

    public double getCommissionTotal() {
        return commissionTotal;
    }


}

