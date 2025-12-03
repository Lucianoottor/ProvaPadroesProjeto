public abstract class Decorator implements iRelatorio {
    protected iRelatorio relatorio;
    public Decorator(iRelatorio relatorio) {
        this.relatorio = relatorio;
    }
}
