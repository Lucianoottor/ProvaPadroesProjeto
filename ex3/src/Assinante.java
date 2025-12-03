import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {
	
	Observable machineHealth;
	
	int edicaoNova;
	
	public Assinante(Observable machineHealth) {
		this.machineHealth = machineHealth;
		machineHealth.addObserver(this);
	}
	
	@Override
	public void update(Observable maquina, Object arg1) {
		if (machineHealth instanceof MachineHealth) {
			MachineHealth machineHealth = (MachineHealth) maquina;
			edicaoNova = machineHealth.getEdicao();
			System.out.println("Atenção, já chegou a mais uma edição da maquina. " +
					"Esta é a sua edição número: " + edicaoNova); 
		}
	}	
}
