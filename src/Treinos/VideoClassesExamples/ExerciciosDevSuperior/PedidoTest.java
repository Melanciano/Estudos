package Treinos.VideoClassesExamples.ExerciciosDevSuperior;
import Treinos.VideoClassesExamples.ExerciciosDevSuperior.Pedido.*;
import Treinos.VideoClassesExamples.ExerciciosDevSuperior.Pedido.Enums.TipoPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PedidoTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("E-mail: ");
        String email = sc.next();
        System.out.println("Data de nascimento (DD/MM/AAAA)");
        Date dataNasc = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome,email,dataNasc);

        System.out.println("Digite os dados do pedido");
        System.out.println("Estado: (AGUARDANDO_PAGAMENTO, EM_PROCESSO,ENVIADO, ENTREGUE)");
        TipoPedido estado = TipoPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(),estado,cliente);


        System.out.println("Quantos itens o pedido terá?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            System.out.println("Digite os dados do item #" + (i+1) );
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.println("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.println("Quantidade do produto: ");
            int qtd = sc.nextInt();

            Produto produto = new Produto(nomeProduto,precoProduto);
            ItemPedido item = new ItemPedido(qtd,precoProduto,produto);
            pedido.addItem(item);
        }
        System.out.println();
        System.out.println(pedido);

        sc.close();
    }
}
