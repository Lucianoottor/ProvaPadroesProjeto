public class filtrosNovos implements iAdapter {
    private filtrosLegado filtrosLegado;
    public filtrosNovos(filtrosLegado filtrosLegado){
        this.filtrosLegado = filtrosLegado;
    }
    
    @Override
    public int filtroAzul(int b) {
        return filtrosLegado.filtroAzul(b*2);
    }

    @Override
    public int filtroVerde(int g) {
        return filtrosLegado.filtroVerde(g*2);
    }

    @Override
    public int filtroVermelho(int r) {
        return filtrosLegado.filtroVermelho(r*2);
    }
}