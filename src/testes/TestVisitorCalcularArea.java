package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.CalculaArea;

class TestVisitorCalcularArea {
	
	static Visitor vis;
	static Circulo ci;
	static Triangulo tri;
	static Retangulo ret;
	static Trapezio trp;
	
	@BeforeAll
	static void init(){
		vis = new CalculaArea();
		trp = new Trapezio(5, 10, 4, 3);
		ci = new Circulo(100);
		ret = new Retangulo(11, 5);
		tri = new Triangulo(7, 8.1);
	}

	@Test
	void calcularAreaCirculo() {
		assertEquals(31415.926, vis.visitaCirculo(ci), 0.001);
	}
	
	@Test
	void calcularAreaTriangulo() {
		assertEquals(28.349, vis.visitaTriangulo(tri), 0.001);
	}
	
	@Test
	void calcularAreaRetangulo() {
		assertEquals(55, vis.visitaRetangulo(ret));
	}
	
	@Test
	void calcularAreaTrapezio() {
		assertEquals(22.5, vis.visitaTrapezio(trp), 0.1);
	}

}
