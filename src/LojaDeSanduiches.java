import java.util.Scanner;

public class LojaDeSanduiches {

    private String CNPJ = "63.358.000/0001-51";
    private String razaoSocial = "Lanches SAI LTDA";
    private String endereco = "Rua da fome";
    Cliente cliente;
    private boolean receberPedido;

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String n = scanner.nextLine();

        System.out.println("Informe seu cpf:");
        String c = scanner.nextLine();

        System.out.println("Informe seu telefone:");
        String t = scanner.next();

        Cliente clientes = new Cliente(n, c, t);

        this.cliente = clientes;

    }

    public double calcularPreco(Cliente cliente) {

        double total = 0;

        for (Pedido p : cliente.getPedidos()) {
            total += p.obterValorTotalDosProdutos();

        }

        return total;
    }

    public void emitirNotaFiscal(Cliente cliente, LojaDeSanduiches loja) {
        System.out.println("\n\n--------------------CUPOM FISCAL--------------------------------");
        System.out.println("Dados da empresa");
        System.out.println("CNPJ: " + loja.getCNPJ());
        System.out.println("Razão Social: " + loja.getRazaoSocial());
        System.out.println("Endereço: " + loja.getRazaoSocial());
        System.out.println("\n\n------------------------------------------------------------------");
        System.out.println("Dados do cliente");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("\n------------------------------------------------------------------");

        for (Pedido ped : cliente.getPedidos()) {
            for (Produto pro : ped.getProdutos()) {

                System.out.println(pro.getNome() + " ----- R$ " + pro.getPreco() + " ---- Qtd " + pro.getQuantidade());
            }

        }
        System.out.println("Valor total = R$ " + loja.calcularPreco(cliente));


        System.out.println("-----------------------------FIM----------------------------------");

    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isReceberPedido() {
        return receberPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setReceberPedido(boolean receberPedido) {
        this.receberPedido = receberPedido;
    }

}