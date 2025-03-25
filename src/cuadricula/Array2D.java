package cuadricula;

public class Array2D {

	// Propiedades
	private int filas;
	private int cols;
	private int[][] array;

    // Constructores

	public Array2D(int filas, int cols) {
		// filas y columnas entre 0 y 10
		this.filas = filas < 0 ? 0 : filas > 10 ? 10 : filas;
		this.cols = cols < 0 ? 0 : cols > 10 ? 10 : cols;
		this.array = new int[filas][cols];
	}

	public Array2D(int dimension) {
		this(dimension, dimension);
	}

}
