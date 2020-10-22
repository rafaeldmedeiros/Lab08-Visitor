package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Circulo implements ElementoConcreto {

private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void aceitaVisita(Visitor visitor) {
		Double result = visitor.visitaCirculo(this);
		if(result != null)
			System.out.println(result);
	}
}
