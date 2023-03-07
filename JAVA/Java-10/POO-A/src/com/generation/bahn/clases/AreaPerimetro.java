package com.generation.bahn.clases;

public class AreaPerimetro {

	public double areaCuadrado(double lado) {
		// TODO Auto-generated method stub
		double area = lado * lado;
		return area;
	}

	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double areaTriangulo(double base, double altura) {
	return (base * altura)/2; 
	}

	public double perimetroTriangulo(double ladoA, double ladoB,double ladoC) {
		return (ladoA+ladoB+ladoC);
}
	//Circulo area

	public double areaCirculo(double radio) {
		return (3.1416 * (radio * radio));
	}

	//Circulo perimetro

	public double perimetroCirculo(double radio) {
		return (2 * (3.1416 * radio));
	}
}