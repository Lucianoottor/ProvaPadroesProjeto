public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();    
        pedido.processado(); 
        pedido.enviado();    
        pedido.entregue();    
        pedido.cancelado();  
    }
}
