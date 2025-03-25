package generics2;

import java.util.Arrays;

public class Estanteria<T> {
	private T[] estantes;

	public Estanteria(T[] estantes) {
		this.estantes = estantes;
	}

	@Override
	public String toString() {
		return "Estanteria [estantes=" + Arrays.toString(estantes) + "]";
	}
	
	

}
