package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class Desenha implements Visitor {

	@Override
	public Double visitaRetangulo(Retangulo r) {
		System.out.println("Retângulo desenhado!");
		return null;
	}

	@Override
	public Double visitaTriangulo(Triangulo t) {
		System.out.println("Triângulo desenhado!");
		return null;
	}

	@Override
	public Double visitaCirculo(Circulo c) {
		System.out.println("Circulo desenhado!");
		return null;
	}

	@Override
	public Double visitaTrapezio(Trapezio c) {
		System.out.println("Trapézio desenhado!");
		return null;
	}
	
}
