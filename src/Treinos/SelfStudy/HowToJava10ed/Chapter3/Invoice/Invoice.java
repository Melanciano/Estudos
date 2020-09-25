package Treinos.SelfStudy.HowToJava10ed.Chapter3.Invoice;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;


    public Invoice() {

    }

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getInvoiceAmount(){
      if(quantity < 0){
          this.quantity = 0;
      } else if (price < 0.00){
          this.price = 0.00;
      }

      return quantity * price;


    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
