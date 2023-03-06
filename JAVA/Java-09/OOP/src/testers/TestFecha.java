package testers;

import oop.clases.Fecha;

public class TestFecha {

	public static void main(String[] args) 
	{
		Fecha f = new Fecha(6,3,2023);
		System.out.println(f.mostrarFechaDiaMesAnio());
		System.out.println(f.toString());
	}
}