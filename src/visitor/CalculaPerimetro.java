package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalculaPerimetro implements Visitor{

	@Override
	public Double visitaRetangulo(Retangulo r) {
		return 2 * (r.getAltura() + r.getBase());
	}

	@Override
	public Double visitaTriangulo(Triangulo t) {
		double hip = Math.sqrt(
				Math.pow(t.getBase(), 2) + Math.pow(t.getAltura(), 2)
				);
		return t.getBase() + t.getAltura() + hip;
	}

	@Override
	public Double visitaCirculo(Circulo c) {
		return 2 * Math.PI * c.getRaio();
	}

	@Override
	public Double visitaTrapezio(Trapezio t) {
		return t.getBaseMaior() + t.getBaseMenor() + t.getLados() * 2;
	}
	
}
