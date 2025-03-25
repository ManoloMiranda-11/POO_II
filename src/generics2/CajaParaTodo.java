package generics2;

public class CajaParaTodo {
	private Object contenido;

	public CajaParaTodo(Object contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CajaParaTodo []";
	}

	public Object getContenido() {
		return contenido;
	}
	
	
	


}
