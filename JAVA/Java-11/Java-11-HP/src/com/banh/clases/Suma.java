package com.banh.clases;

public class Suma implements OperacionesAritmeticas, Mensajes
{
	private double a;
	private double b;
	
	public Suma() 
	{
		super();
	}

	public Suma(double a, double b) 
	{
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double sumar() 
	{
		return this.a + this.b;
	}

	@Override
	public double restar() 
	{
		return this.a - this.b;
	}

	@Override
	public void mensaje() 
	{
		System.out.println("Hola soy una suma");
	}
}