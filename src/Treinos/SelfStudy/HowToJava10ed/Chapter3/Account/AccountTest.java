package Treinos.SelfStudy.HowToJava10ed.Chapter3.Account;
import Treinos.SelfStudy.HowToJava10ed.Chapter3.Account.Account;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Account conta1 = new Account("João", 50.00);
        Account conta2 = new Account("Mário", -17.2) ;

        System.out.println("digite o valor de saque para a conta1: ");
        double valorSaque = input.nextDouble();
        conta1.withdraw(valorSaque);

        Account.displayAccount(conta1);
//
//
//
//        System.out.printf("%s com saldo de: $%.2f %n", conta1.getName(), conta1.getBalance());
//        System.out.printf("%s com saldo de: $%.2f %n%n", conta2.getName(), conta2.getBalance());
//
//
//
//        System.out.print("Insira o valor de depósito para a conta 1: ");
//        double depositAmount = input.nextDouble();
//        System.out.printf("%nadicionando %.2f para o saldo da conta: %n%n", depositAmount);
//        conta1.deposit(depositAmount);
//
//
//
//        conta1.displayAccount();
//        conta2.displayAccount();
//
//
//        System.out.printf("Insira o valor de depósito para a conta2: ");
//        double depositAmount2;
//        depositAmount2 = input.nextDouble();
//        System.out.printf("%nadicionando %.2f para o saldo da conta: %n%n", depositAmount2);
//        conta2.deposit(depositAmount2);
//
//        conta1.displayAccount();
//        conta2.displayAccount();

    }
}
