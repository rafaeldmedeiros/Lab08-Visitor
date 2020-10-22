package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.MaximizaFigura;

class TestVisitorMaximizaFigura {

	static Visitor vis;
	static Circulo ci = new Circulo(3);
	static Triangulo tri = new Triangulo(7, 3);
	static Retangulo ret = new Retangulo(10, 5);
	static Trapezio trp = new Trapezio(5, 8, 4, 3);
	
	@BeforeAll
	static void init(){
		vis = new MaximizaFigura();
		vis.visitaCirculo(ci);
		vis.visitaTriangulo(tri);
		vis.visitaRetangulo(ret);
		vis.visitaTrapezio(trp);
	}
	
	@Test
	void testRaioCirculoMaximizado() {
		assertEquals(6, ci.getRaio());
	}
	
	@Test
	void testTrianguloMaximizado() {
		assertEquals(14, tri.getBase());
		assertEquals(6, tri.getAltura());
	}
	
	@Test
	void testBaseRetanguloMaximizado() {
		assertEquals(20, ret.getBase());
		assertEquals(10, ret.getAltura());
	}
	
	@Test
	void testBaseMenorTrapezioMaximizado() {
		assertEquals(10, trp.getBaseMenor());
		assertEquals(16, trp.getBaseMaior());
		assertEquals(8, trp.getLados());
		assertEquals(6, trp.getAltura());
	}
}