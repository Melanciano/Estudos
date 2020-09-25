package Treinos.ExerciciosDevDojo.Estudante;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;


    public void imprime() {

        double media = somaArray( notas) / notas.length;
        System.out.println(" nome " + this.nome);
        System.out.println("idade " + this.idade);
        System.out.println("nota 1: " + this.notas[0]);
        System.out.println("nota 2: " + this.notas[1]);
        System.out.println("nota 3: " + this.notas[2]);
        System.out.println("media:  " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Repovado");
        }
    }

    public double somaArray(double[] a){
        double soma = 0;
        for(double aux:a){
            soma += aux;
        }
        return soma;
    }

}







