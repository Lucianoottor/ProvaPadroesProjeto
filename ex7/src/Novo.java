public class Novo implements iState {
    private Pedido pedido;
    
    public Novo(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void novo() {
        System.out.println("O pedido já está no estado Novo.");
    }

    @Override
    public void processado() {
        System.out.println("Transição: Novo para Processado");
        pedido.setEstado(new StateProcessado(pedido));
    }

    @Override
    public void enviado() {
        System.out.println("Transição inválida: Novo para Enviado");
    }

    @Override
    public void entregue() {
        System.out.println("Transição inválida: Novo para Entregue");
    }

    @Override
    public void cancelado() {
        System.out.println("Transição: Novo para Cancelado");
        pedido.setEstado(new Cancelado());
    }
    
}
