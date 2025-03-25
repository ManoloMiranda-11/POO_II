package generics;

public class Pareja <T,S> {
	private S Raton;

	public Pareja(S raton) {
		super();
		Raton = raton;
	}

	public S getRaton() {
		return Raton;
	}

	public void setRaton(S raton) {
		Raton = raton;
	}

	@Override
	public String toString() {
		return "Pareja [Raton=" + Raton + "]";
	}
	
	
	
	
	

}
