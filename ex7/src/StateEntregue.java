public class StateEntregue implements iState {
    private Pedido pedido;
    
    public StateEntregue(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void novo() {
        System.out.println("Transição inválida: Entregue para Novo");
    }

    @Override
    public void processado() {
        System.out.println("Transição inválida: Entregue para Processado");
    }

    @Override
    public void enviado() {
        System.out.println("Transição inválida: Entregue para Enviado");
    }

    @Override
    public void entregue() {
        System.out.println("O pedido já está no estado Entregue.");
    }

    @Override
    public void cancelado() {
        System.out.println("Transição inválida: Entregue para Cancelado");
    }
}