package vehiculos;

public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(160, 4, 1300, false);
		c1.abrirPuertas();
		System.out.println(c1);
		c1.cerrarPuertas();
		c1.acelerar();
		c1.frenar();
		c1.arrancarMotor();
		c1.pararMotor();
		
		Motocicleta m1 = new Motocicleta(90, 2, 200, false, false);
		System.out.println(m1);
		m1.acelerar();
		m1.frenar();
		m1.arrancarMotor();
		m1.pararMotor();
		
		Bicicleta b1 = new Bicicleta(30, 2, 20);
		System.out.println(b1);
	}

}
