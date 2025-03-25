package _interfacesfuncionales.interfaces;

public abstract class Animal extends Object implements Desplazable {
	
	public void respirar() {
		System.out.println(getClass().getSimpleName() + " respirando");
	}

}
