package com.banh.clases;

public class Circulo extends FigurasGeometricas 
{
	private int radio;

	public Circulo() 
	{
		super("Circulo");
	}
	
	public Circulo(int radio) 
	{
		super("Circulo");
		this.setRadio(radio);
	}

	@Override
	public double areas() 
	{
		return Math.PI * (Math.pow(this.radio, 2));
	}

	public int getRadio() 
	{
		return radio;
	}

	public void setRadio(int radio) 
	{
		this.radio = radio;
	}

	@Override
	public void pedirDatos() 
	{
		
	}
}