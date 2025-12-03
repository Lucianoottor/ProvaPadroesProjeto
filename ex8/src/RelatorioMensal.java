public class RelatorioMensal extends Decorator {
    private String mes;
    public RelatorioMensal(iRelatorio relatorio, String mes) {
        super(relatorio);
        this.mes = mes;
    }
    @Override
    public void saldo() {
        System.out.println("Relatório Mensal - Mês: " + mes);
        relatorio.saldo();
    }
    @Override
    public void totalTransacoes() {
        System.out.println("Relatório Mensal - Mês: " + mes);
        relatorio.totalTransacoes();
    }
    
}
