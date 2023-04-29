public class App {
    public static void main(String[] args) throws Exception {
    

        LojaDeSanduiches loja = new LojaDeSanduiches();
        loja.cadastrarCliente();
        Cliente cliente = loja.getCliente();
        cliente.realizarPedido();
        cliente.adicionarPedido(cliente.getPedido(), loja);       
        loja.emitirNotaFiscal(cliente, loja);
        
     
    }
}
