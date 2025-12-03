import java.util.Observable;
import java.util.Observer;

public class App {
    public static void main(String[] args) {
        MachineHealth machineHealth = new MachineHealth();
        Assinante dashboard = new Assinante(machineHealth);
        Assinante tickets = new Assinante(machineHealth);
        Assinante modulo = new Assinante(machineHealth);
        
        machineHealth.setNovaEdicao(1);
    }
}