public class Pedido implements iState {
    private iState estado;

    public Pedido() {
        this.estado = new Novo(this);
    }

    public void setEstado(iState estado) {
        this.estado = estado;
    }

    public void novo() {
        estado.novo();
    }

    public void processado() {
        estado.processado();
    }

    public void enviado() {
        estado.enviado();
    }

    public void entregue() {
        estado.entregue();
    }

    public void cancelado() {
        estado.cancelado();
    }
    
}
