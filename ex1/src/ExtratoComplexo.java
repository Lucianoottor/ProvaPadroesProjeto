public class ExtratoComplexo implements iExtrato {
    private int saldo;
    private int taxa;

    @ Override
    public void gerarDados() {
        System.out.println("Gerando extrato complexo...");
        this.saldo = 2000;
        this.taxa = 50;
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Taxa: " + this.taxa);
    }

    @ Override
    public void calculoSaldo() {
        System.out.println("Calculando saldo no extrato complexo...");
        this.saldo += 1000 - this.taxa;
        System.out.println("Novo saldo: " + this.saldo);
    }
}