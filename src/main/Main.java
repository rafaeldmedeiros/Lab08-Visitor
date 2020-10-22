package main;

import interfaces.ElementoConcreto;
import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.CalculaArea;
import visitor.CalculaPerimetro;
import visitor.Desenha;
import visitor.MaximizaFigura;

public class Main {

	public static void main(String[] args) {
		
		Visitor visitorArea = new CalculaArea();
		Visitor visitorDesenho  = new Desenha();
		Visitor visitorPerimetro = new CalculaPerimetro();
		Visitor visitorMaximiza = new MaximizaFigura();
 		
		ElementoConcreto circulo = new Circulo(8);
		ElementoConcreto triangulo = new Triangulo(14, 5);
		ElementoConcreto retangulo = new Retangulo(10, 5);
		ElementoConcreto trapezio = new Trapezio(3, 8, 4, 3);
		
		Visitor[] visitors = new Visitor[] {visitorArea, visitorPerimetro, visitorDesenho, visitorMaximiza};
		
		for(Visitor visitor : visitors) {
			System.out.println();
			System.out.println("Executando " + visitor.getClass().getSimpleName());
			
			System.out.print("Retângulo: ");
			retangulo.aceitaVisita(visitor);
			
			System.out.print("Circulo: ");
			circulo.aceitaVisita(visitor);
			
			System.out.print("Triângulo: ");
			triangulo.aceitaVisita(visitor);
			
			System.out.print("Trapézio: ");
			trapezio.aceitaVisita(visitor);
		}
	}
}
