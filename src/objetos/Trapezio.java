package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Trapezio implements ElementoConcreto {

	private double baseMenor;
	private double baseMaior;
	private double lados;
	private double altura;
	
	public Trapezio(double baseMenor, double baseMaior, double lados, double altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.lados = lados;
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void aceitaVisita(Visitor visitor) {
		Double result = visitor.visitaTrapezio(this);
		if(result != null)
			System.out.println(result);
	}
	
}
