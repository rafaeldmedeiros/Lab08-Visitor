package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.CalculaPerimetro;

class TestVisitorCalcularPerimetro {
	static Visitor vis;

	static Circulo ci;
	static Triangulo tri;
	static Retangulo ret;
	static Trapezio trp;
	
	@BeforeAll
	static void init(){
		vis = new CalculaPerimetro();

		trp = new Trapezio(5, 8, 4, 3);
		ci = new Circulo(5);
		tri = new Triangulo(7, 3);
		ret = new Retangulo(10, 5);
	}
	@Test
	void calcularPerimetroCirculo() {
		assertEquals(31.4159, vis.visitaCirculo(ci), 0.001);
	}
	
	@Test
	void calcularPerimetroTriangulo() {
		assertEquals(17.6157, vis.visitaTriangulo(tri), 0.001);
	}
	
	@Test
	void calcularPerimetroRetangulo() {
		assertEquals(30, vis.visitaRetangulo(ret));
	}
	
	@Test
	void calcularPerimetroTrapezio() {
		assertEquals(21, vis.visitaTrapezio(trp));
	}

}
