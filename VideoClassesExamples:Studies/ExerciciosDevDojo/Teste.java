package Treinos.ExerciciosDevDojo;
import Treinos.ExerciciosDevDojo.Seminario.*;
public class Teste {
    public static void main(String[] args){

        Aluno aluno = new Aluno("Pedro", 23);
       Seminario sem = new Seminario("Aprendendo a programar");
        aluno.setSeminario(sem);

        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Agente fiscal Amadeu de Castro", "Aeroclube");
        sem.setProfessor(prof);
        sem.setLocal(local);
        Aluno aluno2 = new Aluno("Iakson Araujo", 28);
        sem.setAlunos(new Aluno[] {aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminario(semArray);
        aluno.print();
        prof.print();
        local.print();
        sem.print();

    }
}
