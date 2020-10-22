package interfaces;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public interface Visitor {
	
	Double visitaRetangulo(Retangulo r);
	Double visitaTriangulo(Triangulo t);
	Double visitaCirculo(Circulo c);
	Double visitaTrapezio(Trapezio t);
}
