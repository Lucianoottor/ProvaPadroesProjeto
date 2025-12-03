public class main {
    public static void main(String[] args) {
        iFactory factorySimples = new FactoryExtratoSimples();
        iExtrato extratoSimples = factorySimples.criarExtrato();
        extratoSimples.gerarDados();
        extratoSimples.calculoSaldo();

        System.out.println("-----");

        iFactory factoryComplexo = new FactoryExtratoComplexo();
        iExtrato extratoComplexo = factoryComplexo.criarExtrato();
        extratoComplexo.gerarDados();
        extratoComplexo.calculoSaldo();
    }
}
