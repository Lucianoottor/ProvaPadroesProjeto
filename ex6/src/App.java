public class App {
    public static void main(String[] args) throws Exception {
        filtrosLegado filtrosLegado = new filtrosLegado();
        iAdapter filtrosNovos = new filtrosNovos(filtrosLegado);

        int azul = filtrosNovos.filtroAzul(100);
        int verde = filtrosNovos.filtroVerde(150);
        int vermelho = filtrosNovos.filtroVermelho(200);

        System.out.println("Filtro Azul: " + azul);
        System.out.println("Filtro Verde: " + verde);
        System.out.println("Filtro Vermelho: " + vermelho);
    }
}
