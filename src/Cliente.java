import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private List<Pedido> pedidos = new ArrayList<>();
    Pedido pedido;

    Cliente(String nome, String cpf, String telefone) {
        this.telefone = telefone;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void realizarPedido() {

        boolean sair = true;
        Pedido p = new Pedido();

        while (sair) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\nQual pedido voce deseja " + this.nome);
            System.out.println(
                    "1 - Frango = R$ 15.00\n2 - Bacon = R$ 10.00\n3 - Salada = R$ 13.50\n4 - Hambuhuer = R$ 16.70\n5 - Queijo = R$ 8.00");

            int numero = scan.nextInt();

            System.out.println("Qual a quantidade desse produto?");
            int quantidade = scan.nextInt();

            Produto produto = new Produto();

            String nomeSanduiche = produto.getSanduiches().get(numero - 1);
            Double precoSanduiche = produto.getPrecos().get(numero - 1);

            p.adicionarProdutosNoPedido(new Produto(nomeSanduiche, precoSanduiche, quantidade));

            System.out.println("Deseja adicionar outro produto? ( Sim ou Não)");
            String resposta = scan.next();

            if (resposta.equalsIgnoreCase("sim")) {
                this.pedido = p;

                sair = true;
            } else {
                sair = false;
            }

        }

        System.out.println("\n\n\n");

    }

    public void adicionarPedido(Pedido pedido, LojaDeSanduiches loja) {
        this.pedidos.add(pedido);

        loja.setReceberPedido(true);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
