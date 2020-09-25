package SGE;

import java.util.Scanner;

public class Vendedor  extends Pessoa {


    public void cadastroVendedor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Cadastro de Vendedor------");

        System.out.println("nome completo");
        setNome(sc.nextLine());

        System.out.println("Endereço de e-mail: ");
        setEmail(sc.nextLine());

        System.out.println("CPF: ");
        setCPF(sc.nextLine());

        System.out.println("RG: ");
        setRG(sc.nextLine());

        System.out.println("Endereço: ");
        setEndereco(sc.nextLine());
    }
}
