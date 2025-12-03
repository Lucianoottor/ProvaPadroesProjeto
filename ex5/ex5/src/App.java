public class App {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance("Acesso 1");
        System.out.println(singleton.getAcesso());


        Singleton singleton2 = Singleton.getInstance("Acesso 2");
        System.out.println(singleton2.getAcesso());

    }
}
