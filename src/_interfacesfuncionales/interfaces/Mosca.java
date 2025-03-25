package _interfacesfuncionales.interfaces;

public class Mosca extends Animal implements Volador {

	@Override
	public void planear() {
		System.out.println("Mosca planeando");
		
	}

	@Override
	public String mover(int tiempoEnSegundos) {
		return null;
	}
	
	

}
