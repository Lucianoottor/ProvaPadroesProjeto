public class App {
    public static void main(String[] args) throws Exception {
        Context context = new Context(new algoritmoA());
        int resultA = context.executeStrategy(5, 3);
        System.out.println("Usuario entrou no algoritmo A (5, 3): " + resultA);
        context = new Context(new algoritmoB());
        int resultB = context.executeStrategy(5, 3);
        System.out.println("Usuario entrou no algoritmo B (5, 3): " + resultB);
    }
}
