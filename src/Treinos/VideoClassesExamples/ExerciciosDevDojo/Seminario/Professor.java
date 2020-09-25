package Treinos.VideoClassesExamples.ExerciciosDevDojo.Seminario;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void print(){
        System.out.println("--------------Relatorio de professor---------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminarios participados ");
        for(Seminario sem : seminarios){
            System.out.println(sem.getTitulo() + " ");
        }

    }





    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEspecialidade() {

        return especialidade;
    }

    public void setEspecialidade(String especialidade) {

        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {

        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {

        this.seminarios = seminario;
    }
}
