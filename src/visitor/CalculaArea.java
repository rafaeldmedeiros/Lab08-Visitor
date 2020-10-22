package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalculaArea implements Visitor{
	@Override
	public Double visitaRetangulo(Retangulo r) {
		return r.getAltura() * r.getBase();
	}

	@Override
	public Double visitaTriangulo(Triangulo t) {
		return (t.getAltura() * t.getBase()) / 2;
	}

	@Override
	public Double visitaCirculo(Circulo c) {
		return Math.PI * (c.getRaio() * c.getRaio());
	}

	@Override
	public Double visitaTrapezio(Trapezio t) {
		return ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2;
	}
}
