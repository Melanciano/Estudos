package SGE;

public class Pessoa {

    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private String rg;
    private String telefone;

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




}


