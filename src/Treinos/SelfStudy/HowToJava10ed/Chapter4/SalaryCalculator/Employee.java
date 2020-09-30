package Treinos.SelfStudy.HowToJava10ed.Chapter4.SalaryCalculator;
import java.util.Scanner;

public class Employee {

    private String name;
    private int hoursWorkedWeek;
    private double workHourValue;
    private double salary;

    public void calculateSalary(){
Scanner input = new Scanner(System.in);


        if (hoursWorkedWeek == 0) {

            System.out.println("please insert this week's total work  hours ");

            hoursWorkedWeek = input.nextInt();
        }
        if (workHourValue == 0.0) {
            System.out.println("Please insert the work/hour ratio value");
            workHourValue = input.nextDouble();
        }


        if(hoursWorkedWeek <= 40){
            salary = hoursWorkedWeek * workHourValue;
            System.out.println("Salary equals: " + salary);
        } else {
            salary = 40 * workHourValue +  (hoursWorkedWeek - 40) * (workHourValue * 1.5) ;
            System.out.println("Salary equals: " + salary);
        }

    }


    public Employee(){

    }

    public Employee(String name, int hoursWorkedWeek, double workHourValue) {
        this.name = name;
        this.hoursWorkedWeek = hoursWorkedWeek;
        this.workHourValue = workHourValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorkedWeek() {
        return hoursWorkedWeek;
    }

    public void setHoursWorkedWeek(int hoursWorkedWeek) {
        this.hoursWorkedWeek = hoursWorkedWeek;
    }

    public double getWorkHourValue() {
        return workHourValue;
    }

    public void setWorkHourValue(double workHourValue) {
        this.workHourValue = workHourValue;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
