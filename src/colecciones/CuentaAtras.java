package colecciones;

public class CuentaAtras {
	
	private int[] valores;
	
	public CuentaAtras(int numeroInicial, int numeroFinal) {
		// Si inicial es 5 y final 2, guarda en el array 5, 4, 3, 2
		if (numeroInicial < numeroFinal) {
            valores = new int[0];
        } else {
            valores = new int[numeroInicial - numeroFinal + 1];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = numeroInicial - i;
            }
        }
    }
	
	@Override
    public String toString() {
		// Si en el array 5, 4, 3, 2 devuelve 5 ... 4 ... 3 ... 2
        String resultado = "";
        for (int i = 0; i < valores.length; i++) {
            resultado += valores[i];
            if (i < valores.length - 1) {
                resultado += " ... ";
            }
        }
        return resultado;
    }

	
	public void quitaUno() {
		// Si en el array 5, 4, 3, 2 debe dejar 5 ... 4 ... 3
		if (valores.length > 0) {
            int[] nuevosValores = new int[valores.length - 1];
            for (int i = 0; i < nuevosValores.length; i++) {
                nuevosValores[i] = valores[i];
            }
            valores = nuevosValores;
        }
    }
	
	public static void main(String[] args) {
		CuentaAtras c1 = new CuentaAtras(5, 2);
		System.out.println(c1);
		c1.quitaUno();
        System.out.println(c1);

	}

}
