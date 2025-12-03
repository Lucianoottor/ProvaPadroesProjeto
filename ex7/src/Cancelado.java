public class Cancelado implements iState {
    
    @Override
    public void novo() {
        System.out.println("Transição inválida: Cancelado para Novo");
    }

    @Override
    public void processado() {
        System.out.println("Transição inválida: Cancelado para Processado");
    }

    @Override
    public void enviado() {
        System.out.println("Transição inválida: Cancelado para Enviado");
    }

    @Override
    public void entregue() {
        System.out.println("Transição inválida: Cancelado para Entregue");
    }

    @Override
    public void cancelado() {
        System.out.println("O pedido já está no estado Cancelado.");
    }
    
}
