package generics;

public class Caja <T> {
	private T contenido;

	public Caja(T contenido) {
		super();
		this.contenido = contenido;
	}

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}
	
	public static void main(String[] args) {
		Caja<String> cs = new Caja<String>("mimimimimi");
		
		System.out.println(cs.toString());
		
	}
	

}
