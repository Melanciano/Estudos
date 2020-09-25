package SGE;

import SGE.Enums.TipoUsuario;

import java.util.Scanner;

public class Vendedor  extends Pessoa {


    Vendedor(){

    }
    Vendedor(String nome, String email, String endereco, String cpf, String rg){
       this.setNome(nome);
       this.setEmail(email);
       this.setEndereco(endereco);
        this.setCPF(cpf);
        this.setRG(rg);
    }

    @Override
    public void cadastroPessoa() {
        setUsuario(TipoUsuario.VENDEDOR);
        super.cadastroPessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("RG:");
        setRG(sc.nextLine());
    }
}

