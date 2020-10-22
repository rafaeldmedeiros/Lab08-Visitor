package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.Desenha;

class TestVisitorDesenha {

	static Visitor vis;

	static Circulo ci;
	static Triangulo tri;
	static Retangulo ret;
	static Trapezio trp;
	
	@BeforeAll
	static void init(){
		vis = new Desenha();
		trp = new Trapezio(5, 8, 4, 3);
		ci = new Circulo(5);
		tri = new Triangulo(7, 3);
		ret = new Retangulo(10, 5);
	}

	@Test
	void desenhaCirculo() {
		assertNull(vis.visitaCirculo(ci));
	}
	
	@Test
	void desenhaTriangulo() {
		assertNull(vis.visitaTriangulo(tri));
	}
	
	@Test
	void desenhaRetangulo() {
		assertNull(vis.visitaRetangulo(ret));
	}
	
	@Test
	void desenhaTrapezio() {
		assertNull(vis.visitaTrapezio(trp));
	}

}
