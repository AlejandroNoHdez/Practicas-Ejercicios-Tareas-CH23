package com.generation.banh.mains;

import java.util.*;

public class Colecciones 
{
	public static void main(String[] args) 
	{
		List <String> coleccion = new ArrayList<String>();
		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		/*
			coleccion.add(13);
			coleccion.add(15.15);
			coleccion.add('a');
		*/
		
		for (String elemento : coleccion) 
		{
			System.out.println(elemento);
		}
	}
}