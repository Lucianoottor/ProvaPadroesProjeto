public class ExtratoSimples implements iExtrato {
    private int saldo;
    @ Override
    public void gerarDados() {
        System.out.println("Gerando extrato simples...");
        this.saldo = 1000;
        System.out.println("Saldo: " + this.saldo);
    }

    @ Override
    public void calculoSaldo() {
        System.out.println("Calculando saldo no extrato simples...");
        this.saldo += 500;
        System.out.println("Novo saldo: " + this.saldo);
    }
}
