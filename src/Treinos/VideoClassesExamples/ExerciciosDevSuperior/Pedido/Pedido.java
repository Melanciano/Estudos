package Treinos.VideoClassesExamples.ExerciciosDevSuperior.Pedido;
import Treinos.VideoClassesExamples.ExerciciosDevSuperior.Pedido.Enums.TipoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Pedido {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private TipoPedido estado;
    private Cliente cliente;
    private List <ItemPedido> itens = new ArrayList<ItemPedido>();


    public  Pedido() {

    }

    public Pedido(Date momento, TipoPedido estado, Cliente cliente) {
        this.momento = momento;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public TipoPedido getEstado() {
        return estado;
    }

    public void setEstado(TipoPedido estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item){
        itens.add(item);
    }

    public void removeItem(ItemPedido item){
        itens.remove(item);
    }

    public double total(){
        double soma = 0;
        for( ItemPedido item : itens) {
        soma +=  item.subTotal();
        }
        return soma;
        }

        @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Estado do pedido: ");
        sb.append(estado + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens pedidos: \n");
        for (ItemPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("Preço total ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
        }


}
