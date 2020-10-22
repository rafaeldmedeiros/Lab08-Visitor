package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class Desenha implements Visitor {

	@Override
	public Double visitaRetangulo(Retangulo r) {
		System.out.println("Desenhando Ret�ngulo!");
		return null;
	}

	@Override
	public Double visitaTriangulo(Triangulo t) {
		System.out.println("Desenhando Tri�ngulo!");
		return null;
	}

	@Override
	public Double visitaCirculo(Circulo c) {
		System.out.println("Desenhando Circulo!");
		return null;
	}

	@Override
	public Double visitaTrapezio(Trapezio c) {
		System.out.println("Desenhando Trap�zio!");
		return null;
	}
	
}
