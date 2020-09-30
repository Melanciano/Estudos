package Treinos.SelfStudy.HowToJava10ed.Chapter4.SalesCommission;

import java.util.Scanner;

public class VendorTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the vendor's name?");

        Vendor vendor1 = new Vendor();

        vendor1.setName(input.nextLine());

        vendor1.calculateCommission();



    }
}
