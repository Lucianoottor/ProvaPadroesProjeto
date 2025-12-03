public class RelatorioSimples implements iRelatorio {
    private int saldo;
    private int totalTransacoes;
    @Override
    public void saldo() {
        System.out.println("Saldo: " + saldo);
    }

    @Override
    public void totalTransacoes() {
        System.out.println("Total de Transações: " + totalTransacoes);
    }
}
