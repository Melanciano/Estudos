package Treinos.ExerciciosDevDojo.Seminario;

public class Seminario {
    private String titulo;
    private Local local;
    private Professor professor;
    private Aluno[] alunos;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(){

    }


    public void print(){

        System.out.println("--------------Relatorio de seminario---------------");

        System.out.println("Titulo: " + this.titulo);

        if(this.local != null)
        System.out.println("Local: " + this.local.getRua() + "bairro: " + this.local.getBairro());
        else
            System.out.println("nenhum local cadastrado para esse seminario");
         if(this.professor != null)
    {
        System.out.println("Professor: " + this.professor.getNome());
    } else {
        System.out.println("Nenhum professor cadastrado para esse seminario");
    }
         if(this.alunos != null) {
             System.out.println("Alunos participantes: ");
             for (Aluno aln : this.alunos) {
                 System.out.println(aln.getNome() + " ");
             }
         } else
             System.out.println("Nenhum aluno cadastrado nesse seminario");

    }






    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {

        this.local = local;
    }

    public Professor getProfessor() {

        return professor;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }

    public Aluno[] getAlunos() {

        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {

        this.alunos = alunos;
    }
}
