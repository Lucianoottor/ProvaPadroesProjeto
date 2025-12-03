public class Singleton {
    private static Singleton instance;
    private String acesso = "";
    private String medico = "";
    private String paciente = "";
    private String horario = "";
    private String tipoOperacao = "";


    private Singleton(String acesso) {
        this.acesso = acesso;
    }


    public static Singleton getInstance(String acesso) {
        if (instance == null) {
            instance = new Singleton(acesso);
        }
        return instance;
    }

    public String getAcesso() {
        return this.acesso;
    }
}