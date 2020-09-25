package Treinos.SelfStudy.HowToJava10ed.Chapter3.Account;

public class Account {
    private String name;
private double balance;

public Account(String name, double balance){
    this.name = name;

    if(balance > 0.00){
        this.balance = balance;
    }
}

public void withdraw(double withdrawAmount){


    if(withdrawAmount <= balance){
        balance -= withdrawAmount;
    } else {
        System.out.println("O Valor de débito excedeu o valor de saldo da conta");
    }

}

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            balance = balance + depositAmount;
        }
    }

    public static void displayAccount(Account account) {

        System.out.printf("%s tem saldo de: $%.2f %n", account.getName(), account.getBalance());
    }



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getBalance(){
    return balance;
    }



}
