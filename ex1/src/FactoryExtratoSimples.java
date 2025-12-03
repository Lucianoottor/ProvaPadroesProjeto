public class FactoryExtratoSimples implements iFactory {
    @ Override
    public iExtrato criarExtrato() {
        return new ExtratoSimples();
    }
    
}
