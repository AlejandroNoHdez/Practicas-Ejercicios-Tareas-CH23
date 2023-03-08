package com.generation.banh.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions 
{
	public static void main(String[] args) 
	{
		int divisor;
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Introduzca un valor: ");
		
		try 
		{
			divisor = Integer.parseInt(dato.next());
			
			int division = 10/divisor;
			System.out.println("La division es: " + division);
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("La excepción es: " + ae.getMessage());
		}
		catch (NumberFormatException nfe) 
		{
			System.out.println("El dato es un caracter / " + nfe.getMessage());
		}
		finally 
		{
			System.out.println("Este bloque es opcional y se va a ejecutar con o sin la excepción");
		}
		System.out.println("Continuamos con el flujo de la aplicación");
	}
}