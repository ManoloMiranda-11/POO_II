package vehiculos;

public class Coche extends Vehiculo{
	
	private boolean puertasAbiertas;
	private boolean motorArrancado;
	private String matricula;
	

	public Coche(int velocidadMaxima, int numRuedas, double peso, boolean puertasAbiertas) {
		super(velocidadMaxima, numRuedas, peso);
		this.matricula = matricula;
		puertasAbiertas = false;
		motorArrancado = false;
	}

	public void abrirPuertas() {
		puertasAbiertas = true;
		System.out.println("Puertas abiertas");
	}
	
	public void cerrarPuertas() {
		puertasAbiertas = false;
		System.out.println("Puertas cerradas");
	}

	
	public boolean arrancarMotor() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean pararMotor() {
		// TODO Auto-generated method stub
		return false;
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
		return "Coche ["  + super.toString() + " puertasAbiertas=" + puertasAbiertas + ", motorArrancado=" + motorArrancado + ", matricula=" + matricula + "]";
	}
	
	

}
