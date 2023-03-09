package com.banh.testers;

import com.banh.clases.AlumnoB;
import com.banh.clases.PersonaP;

public class TestPB 
{
	public static void main(String[] args) 
	{
		AlumnoB a = new AlumnoB(123,8.5,"Armando",20);
		PersonaP b = new PersonaP("Maria", 18);
		
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		
		System.out.println(b.toString());
		a.mostrarDatos("Lara");
	}
}