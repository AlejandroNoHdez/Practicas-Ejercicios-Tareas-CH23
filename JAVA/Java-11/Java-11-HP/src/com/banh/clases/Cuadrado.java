package com.banh.clases;

public class Cuadrado extends FigurasGeometricas 
{
	private double lado;
	
	public Cuadrado() 
	{
		super("Cuadrado");
	}

	public Cuadrado(double lado) 
	{
		super("Cuadrado");
		this.setLado(lado);
	}

	@Override
	public double areas() 
	{
		return this.lado*this.lado;
	}

	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado) 
	{
		this.lado = lado;
	}

	@Override
	public void pedirDatos() 
	{
		
	}
}