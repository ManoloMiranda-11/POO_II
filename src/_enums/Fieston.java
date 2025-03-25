package _enums;

import java.lang.module.FindException;

public class Fieston {

	private String lugar;
	private FinDe dia;

	public Fieston(String lugar, FinDe dia) {
		super();
		this.lugar = lugar;
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + "]";
	}

	public static void main(String[] args) {
		Fieston fieston = new Fieston("Core", FinDe.SA);
		System.out.println(fieston);
		for (FinDe f : FinDe.values()) {
			System.out.println(f.presentacion());
		}
		FinDe.values();
	}
}