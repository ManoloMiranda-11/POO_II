package vehiculos;

public class Motocicleta extends Vehiculo{
	
	private boolean motorArrancado;
	private boolean llevarCasco;
	private String matricula;
	
	


	public Motocicleta(int velocidadMaxima, int numRuedas, double peso, boolean motorArrancado,
			boolean llevarCasco) {
		super(velocidadMaxima, numRuedas, peso);
		this.matricula = matricula;
		motorArrancado = false;
		llevarCasco = true;
	}


	public void hacerCaballito() {
		System.out.println("Haciendo caballito");
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
		return "Motocicleta [" + super.toString() + " motorArrancado=" + motorArrancado + ", llevarCasco=" + llevarCasco + ", matricula=" + matricula + "]";
	}
	
	

}
