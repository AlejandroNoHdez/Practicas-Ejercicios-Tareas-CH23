package ciclos.forwhiledo;

import java.util.Scanner;

public class CicloDo 
{
	Scanner dato = new Scanner(System.in);
	
	public void digitosDo()
	{
		System.out.println("\nUso del Do while:");
		int valor, acumulador = 0;
		do 
		{
			System.out.print("Introduzca un dígito entre 0-9: ");
			valor = dato.nextInt();
			acumulador += valor;
			System.out.println("---> " + acumulador);
		} 
		while (valor >= 0 && valor <= 9);
		System.out.println("Bye!");
	}
}