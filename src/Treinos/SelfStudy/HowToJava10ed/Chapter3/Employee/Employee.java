package Treinos.SelfStudy.HowToJava10ed.Chapter3.Employee;

public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }

    public Employee(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nomee){
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0){
            return;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public void giveRaisePercent(double percentage){
        if(percentage > 0)
        this.salarioMensal += percentage/100 * salarioMensal;
    }

}
