package com.generation.banh.ManejoExcepciones;

public class Division 
{
	private int numerador;
	private int denominador;
	
	public Division() 
	{
		super();
	}

	public Division(int numerador, int denominador) throws OpExceptions 
	{
		super();
		
		if(denominador == 0)
		{
			throw new OpExceptions("El denominador es un cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizar()
	{
		System.out.println("El resultado de la division es: " + this.numerador / this.denominador);
	}
}