package SGE;

import SGE.Enums.TipoUsuario;

import java.util.Scanner;

public  class Pessoa {

    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private String rg;
    private String telefone;
    private TipoUsuario usuario;




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getRG(){
        return this.rg;
    }
    public void setRG(String rg){
        this.rg = rg;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setUsuario(TipoUsuario usuario) {
        this.usuario = usuario;
    }

    public void cadastroPessoa() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Cadastro de "+  this.usuario.toString().toLowerCase() + " ------");

        System.out.println("nome completo");
        setNome(sc.nextLine());

        System.out.println("Endereço de e-mail: ");
        setEmail(sc.nextLine());

        System.out.println("Endereço: ");
        setEndereco(sc.nextLine());

        System.out.println("CPF: ");
        setCPF(sc.nextLine());


    }



}


