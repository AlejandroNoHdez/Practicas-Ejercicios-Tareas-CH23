package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile 
{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	    
	    public void cicloW() 
	    {
	    	 System.out.println("\nCiclo while:");
	         int iterador = 0;        
	         while (iterador < 10) 
	         {    
	            System.out.println("Iterador "+ iterador);
	            iterador = iterador +1;
	         }
	    }
	    
	    /* while uso centinela*/
	    public void centinelaW() 
	    { 
	    	System.out.println("\nCiclo while centinela:");
	        final int centinela = -1;
	        System.out.print("Introduzca una nota: ");
	        int nota = entrada.nextInt();
	        
	        while(nota != centinela)
	        {
	        	System.out.println("La nota es: " + nota);
	        	System.out.print("Introduzca una nota: ");
		        nota = entrada.nextInt();
	        }
	        System.out.println("Fin");
	    }
	    
	    public void banderaW() 
	    {
	    	System.out.println("\nCiclo while bandera:");
	    	boolean valorb = false;
	    	
	    	while(!valorb)
	    	{
	    		System.out.println("Introduzca un valor numérico:");
		    	int valorx = entrada.nextInt();
		    	
		    	if(valorx > 0 && valorx < 5)
		    	{
		    		int potaxio = (int)Math.pow(valorx, 2);
		    		System.out.println("El resultado ---> " + potaxio);
		    	}
		    	else
		    	{
		    		valorb = true;
		    		System.out.println("Adios!");
		    	}
	    	}
		}
}