package hilos.banh.pruebas;

import hilos.banh.formarunnable.*;

public class TestRunnable 
{
	public static void main(String[] args) 
	{
		Hilo2 ht = new Hilo2("Pedro");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Canícula")).start();
		new Thread(new Hilo2("Mariano")).start();
	}
}