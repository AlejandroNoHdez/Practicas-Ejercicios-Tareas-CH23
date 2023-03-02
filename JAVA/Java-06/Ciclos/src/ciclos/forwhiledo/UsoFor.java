package ciclos.forwhiledo;

import java.util.Iterator;

public class UsoFor 
{
	public void cicloFor()
	{
		System.out.println("\nUso del ciclo for: ");
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("El iterador ---> " + i);
		}
	}
	
	public void letrasFor()
	{
		System.out.println("\nUso del ciclo for con letras: ");
		for (int i = 'A'; i <= 'Z'; i++) 
		{
			System.out.println("\nSoy ---> " + i);
			char letra = (char) i;
			System.out.println("La letra es: " + letra);
		}
		
		/*for (int i = 'A'; i <= 'Z'; i++) 
		 *{
       			System.out.println("soy --> " + Character.toString((char)i) + ", ");
    		}
		 */
		
		/*for (int i = 'A'; i <= 'Z'; i++) 
		{
		    System.out.println("soy --> " + (char) i);
		}*/
	}
}