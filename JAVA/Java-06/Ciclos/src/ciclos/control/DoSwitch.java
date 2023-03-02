package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class DoSwitch 
{
	public void controlador()
	{
		Scanner s = new Scanner(System.in);
		
		Menus mp = new Menus();
		
		UsoWhile uw = new UsoWhile();
		UsoFor uf = new UsoFor();
		CicloDo cd = new CicloDo();
		
		int opcion;
		
		do 
		{
			mp.menuPrincipal();
			System.out.print("\nIntroduzca una opcion: ");
			opcion = s.nextInt();
			
			switch (opcion) 
			{
				case 1:
							uw.cicloW();
							break;
				case 2:
							uw.centinelaW();
							break;
				case 3:
							uw.banderaW();
							break;
				case 4:
							uf.cicloFor();
							break;
				case 5:
							uf.letrasFor();
							break;
				case 6:
							cd.digitosDo();
							break;
				default:
							System.out.println("\nOpción no válida");
							break;
			}
		} 
		while (opcion!=7);
		System.out.println("Saliste del programa");
	}
}