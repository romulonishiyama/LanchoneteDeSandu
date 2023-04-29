import java.util.Arrays;
import java.util.List;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeDeProdutos;
    private List<String> sanduiches = Arrays.asList("Frango", "Bacon", "Salada", "Hambuhuer", "Queijo");
    private List<Double> precos = Arrays.asList(15.00, 10.00, 13.50, 16.70, 8.00);

    Produto(){
        
    }

    public List<String> getSanduiches() {
        return sanduiches;
    }

   
    public void setSanduiches(List<String> sanduiches) {
        this.sanduiches = sanduiches;
    }

    public List<Double> getPrecos() {
        return precos;
    }

    public void setPrecos(List<Double> precos) {
        this.precos = precos;
    }

    public int getQuantidade() {
        return quantidadeDeProdutos;
    }

    public void setQuantidade(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    Produto(String nome, double preco, int quantidadeDeProdutos) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

}
