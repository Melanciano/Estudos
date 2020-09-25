package Treinos.SelfStudy.HowToJava10ed.Chapter3.Employee;

public class EmployeeTest {
    public static void main(String[] args){

        Employee pedro = new Employee("Pedro","Belaciano", 0.00);

        Employee iakson = new Employee("Iakson","Araujo", 1200 );

        System.out.println(pedro);
        System.out.println(iakson);

        iakson.giveRaisePercent(10);
        System.out.println(iakson);
    }
}
