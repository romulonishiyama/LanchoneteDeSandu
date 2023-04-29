import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private String numeroDoPedido;
    private String CpfDoCliente;
    private int quantidadeDePedidos;
    

    public void adicionarProdutosNoPedido(Produto produto){
        this.produtos.add(produto);
    }

    public double obterValorTotalDosProdutos() {
        double total = 0;
        for(Produto p: produtos){
            total += p.getPreco()  * p.getQuantidade();
        }

        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(String numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public String getCpfDoCliente() {
        return CpfDoCliente;
    }

    public void setCpfDoCliente(String cpfDoCliente) {
        CpfDoCliente = cpfDoCliente;
    }

    public int getQuantidadeDePedidos() {
        return quantidadeDePedidos;
    }

    public void setQuantidadeDePedidos(int quantidadeDePedidos) {
        this.quantidadeDePedidos = quantidadeDePedidos;
    }

}
