package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Retangulo implements ElementoConcreto {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void aceitaVisita(Visitor visitor) {
		Double result = visitor.visitaRetangulo(this);
		if(result != null)
			System.out.println(result);
	}
	
}
