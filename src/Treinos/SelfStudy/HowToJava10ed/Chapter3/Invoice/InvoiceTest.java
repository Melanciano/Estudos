package Treinos.SelfStudy.HowToJava10ed.Chapter3.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice fatura = new Invoice();

        fatura.setPrice(12.50);
        fatura.setQuantity(2);

        System.out.println(fatura.getInvoiceAmount());


    }
}
