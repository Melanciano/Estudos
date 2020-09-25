package Treinos.SelfStudy.HowToJava10ed.Chapter3.Date;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date() {

    }
    public Date(int dia, int mes, int ano) {
this.dia = dia;
this.mes = mes;
this.ano = ano;
    }

    public void displayDate(){
        System.out.printf("%d/%d/%4d", dia, mes ,ano );
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

