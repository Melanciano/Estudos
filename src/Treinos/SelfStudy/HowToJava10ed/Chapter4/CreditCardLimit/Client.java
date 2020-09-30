package Treinos.SelfStudy.HowToJava10ed.Chapter4.CreditCardLimit;

public class Client {
    private int accountNumber;
    private int accountBalance;
    private int  totalMonthDebt;  // total client debt this month;
    private int totalCredit; // total  client credit  this month;
    private int creditCardLimit;


    public Client(){

    };


    public Client(int accountNumber, int accountBalance, int totalMonthDebt, int totalCredit, int creditCardLimit) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.totalMonthDebt = totalMonthDebt;
        this.totalCredit = totalCredit;
        this.creditCardLimit = creditCardLimit;
    }

    public void newBalance(){
int newBalance = accountBalance + totalMonthDebt - totalCredit;

        System.out.printf("The new balance is of %d%n", newBalance);
        int difference = newBalance - accountBalance;

        System.out.println("The difference in balance from last register is of " + difference );

       accountBalance = newBalance;

       if( newBalance < creditCardLimit * -1){
           System.out.println("Credit card limit exceeded");
       }



    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getTotalMonthDebt(){
        return totalMonthDebt;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public int getCreditCardLimit() {
        return creditCardLimit;
    }
}
