package com.generation.banh.mains;

import com.generation.bahn.clases.ClaseGenerica;

public class TestGenerico 
{
	public static void main(String[] args) 
	{
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica<String> stringObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		stringObj.claseTipo();
	}
}