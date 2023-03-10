
package hilos.banh.pruebas;

import hilos.banh.formathread.*;

public class TestThread 
{
	public static void main(String[] args)
	{
		Thread h = new Hilo1("Panela");
		h.start();
		
		Thread h0 = new Hilo1("Maria");
		h0.start();
		
		Thread h1 = new Hilo1("Raul");
		h1.start();
		
		System.out.println(h.getState());
	}
}