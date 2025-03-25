package _interfacesfuncionales2.interfaces;

public class Operaciones implements OperacionEntraEnteroSaleEntero {

	    public int cuadrado(int x) {
	        return x * x;
	    }

	    public int cubo(int x) {
	        return x * x * x;
	    }

	    public int doble(int x) {
	        return x * 2;
	    }

	    public int triple(int x) {
	        return x * 3;
	    }

	    public int polinomio(int x) {
	        return polinomioVariable(5, 7, 9, x);
	    }

	    public int polinomioVariable(int x, int a, int b, int c) {
	        return a * x * x * x + b * x * x + c;
	    }
	    
	    public static void main(String[] args) {
	    	
			Operaciones operaciones = new Operaciones();
			
			int x = 2;
			
			System.out.println(operaciones.cuadrado(x));
			System.out.println(operaciones.cubo(x));
			System.out.println(operaciones.doble(x));
			System.out.println(operaciones.triple(x));
			System.out.println(operaciones.polinomio(x));
			System.out.println(operaciones.polinomioVariable(5, 7, 8, x));
			
			OperacionEntraEnteroSaleEntero cuadrado = s -> s * s;
			OperacionEntraEnteroSaleEntero cubo = s -> s * s * s;
			System.out.println(cuadrado.dale(x));
			System.out.println(cubo.dale(x));
			
		}

		@Override
		public int dale(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

	}