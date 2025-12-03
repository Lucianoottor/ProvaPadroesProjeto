public class StateEnviado implements iState {
    private Pedido pedido;
    
    public StateEnviado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void novo() {
        System.out.println("Transição inválida: Enviado para Novo");
    }

    @Override
    public void processado() {
        System.out.println("Transição inválida: Enviado para Processado");
    }

    @Override
    public void enviado() {
        System.out.println("O pedido já está no estado Enviado.");
    }

    @Override
    public void entregue() {
        System.out.println("Pedido entregue com sucesso.");
        pedido.setEstado(new StateEntregue(pedido));
    }

    @Override
    public void cancelado() {
        System.out.println("Transição inválida: Enviado para Cancelado");
    }
}
