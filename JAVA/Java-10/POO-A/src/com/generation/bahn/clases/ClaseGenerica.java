package com.generation.bahn.clases;

public class ClaseGenerica <T> 
{
	T obj;

	public ClaseGenerica(T obj) 
	{
		super();
		this.obj = obj;
	}
	
	public void claseTipo()
	{
		System.out.println("El Tipo T es: " + obj.getClass().getName());
	}
}