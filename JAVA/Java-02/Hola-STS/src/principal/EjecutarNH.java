package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Alejandro Hernandez");
		//nh.saludar();
		
		String nombre;
		System.out.println("¿Cuál es tu nombre?");
		nombre = sn.next();
		
		NuevoHola nh1 = new NuevoHola();
		nh1.saludoConNombre(nombre);
	}
}