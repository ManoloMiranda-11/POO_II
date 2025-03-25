package vehiculos;

public class Bicicleta extends Vehiculo{
	
	public Bicicleta(int velocidadMaxima, int numRuedas, double peso) {
		super(velocidadMaxima, numRuedas, peso);
		// TODO Auto-generated constructor stub
	}

	public void cambiarMarcha() {
		System.out.println("Cambiando de marcha");
	}

	@Override
	public boolean acelerar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean frenar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Bicicleta ["  + super.toString() + "]";
	}
	

}
