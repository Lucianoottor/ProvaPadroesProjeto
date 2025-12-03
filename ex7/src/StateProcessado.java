public class StateProcessado implements iState {
    private Pedido pedido;
    
    public StateProcessado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void novo() {
        System.out.println("Transição inválida: Processado para Novo");
    }

    @Override
    public void processado() {
        System.out.println("O pedido já está no estado Processado.");
    }

    @Override
    public void enviado() {
        System.out.println("Transição: Processado para Enviado");
        pedido.setEstado(new StateEnviado(pedido));
    }

    @Override
    public void entregue() {
        System.out.println("Transição inválida: Processado para Entregue");
    }

    @Override
    public void cancelado() {
        System.out.println("Transição: Processado para Cancelado");
        pedido.setEstado(new Cancelado());
    }
}