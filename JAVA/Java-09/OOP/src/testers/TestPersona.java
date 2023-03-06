package testers;

import oop.clases.Persona;

public class TestPersona {

	public static void main(String[] args) 
	{
		Persona p = new Persona();
		System.out.println("El nombre es: " + p.nombre);
		p.setNombre("Maria");
		System.out.println("El nombre es: " + p.getNombre());
		
		Persona p0 = new Persona("Pepe");
		System.out.println("El nombre de p0 es: " + p0.getNombre());
		
		Persona p1 = new Persona("Tata", 90 , 1.85 , 85.3 , "Sagitario");
		System.out.println("Los datos son: \n" + p1.datosPersona());
	}
}