package com.banh.testers;

import com.banh.clases.*;

public class TestFigurasGeometricas 
{
	public static void main(String[] args) 
	{
		FigurasGeometricas rectangulo = new Rectangulo(10,2);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas cuadrado = new Cuadrado(8);
		FigurasGeometricas triangulo = new Triangulo(12,6);
		
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(cuadrado.areas());
		System.out.println(triangulo.areas());
		
		System.out.println("\n" + rectangulo.toString());
		System.out.println(circulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
	}
}