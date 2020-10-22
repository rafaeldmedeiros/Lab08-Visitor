package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class MaximizaFigura implements Visitor {

	@Override
	public Double visitaRetangulo(Retangulo r) {
		r.setAltura(r.getAltura() * 2);
		r.setBase(r.getBase() * 2);
		System.out.println("Retângulo maximizado!");
		return null;
	}

	@Override
	public Double visitaTriangulo(Triangulo t) {
		t.setAltura(t.getAltura() * 2);
		t.setBase(t.getBase() * 2);
		System.out.println("Triângulo maximizado!");
		return null;
	}

	@Override
	public Double visitaCirculo(Circulo c) {
		c.setRaio(c.getRaio() * 2);
		System.out.println("Circulo maximizado!");
		return null;
	}

	@Override
	public Double visitaTrapezio(Trapezio c) {
		c.setBaseMaior(c.getBaseMaior() * 2);
		c.setBaseMenor(c.getBaseMenor() * 2);
		c.setAltura(c.getAltura() * 2);
		c.setLados(c.getLados() * 2);
		System.out.println("Trapézio maximizado!");
		return null;
	}
	
}
