public class FactoryExtratoComplexo implements iFactory {
    @ Override
    public iExtrato criarExtrato() {
        return new ExtratoComplexo();
    }
    
}