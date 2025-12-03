public interface iState {
    void novo();
    void processado();
    void enviado();
    void entregue();
    void cancelado();

}