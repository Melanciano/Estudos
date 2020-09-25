package SGE;

import java.util.Scanner;

public class Cliente extends Pessoa{


    public  void cadastroCliente() {

        Scanner sc = new Scanner(System.in);

        System.out.println("------Cadastro de Cliente-----");

        System.out.println("nome completo");
        setNome(sc.nextLine());

        System.out.println("Endereço de e-mail: ");
        setEmail(sc.nextLine());

        System.out.println("CPF/CNPJ: ");
        setCPF(sc.nextLine());

        System.out.println("telefone: ");
        setTelefone(sc.nextLine());

        System.out.println("Endereço: ");
        setEndereco(sc.nextLine());
    }

}
