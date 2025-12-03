public class App {
    public static void main(String[] args) throws Exception {
        iRelatorio relatorioSimples = new RelatorioSimples();
        iRelatorio relatorioMensal = new RelatorioMensal(relatorioSimples, "Janeiro");

        relatorioMensal.saldo();
        relatorioMensal.totalTransacoes();
    }
}
