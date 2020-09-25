package Treinos.VideoClassesExamples.ExerciciosDevSuperior.Pedido;

public class ItemPedido {
    private int qtd;
    private double preco;
    private Produto produto;

    public ItemPedido(int qtd, double preco, Produto produto) {
        this.qtd = qtd;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return preco * qtd;
    }


    @Override
    public String toString() {
        return getProduto().getNome()
                + ", R$"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + qtd
                + ", subtotal: R$"
                + String.format("%.2f", subTotal());
    }


}
