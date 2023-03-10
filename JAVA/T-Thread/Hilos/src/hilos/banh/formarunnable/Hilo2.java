package hilos.banh.formarunnable;

public class Hilo2 implements Runnable
{
	private String nombre;
	
	public Hilo2(String nombre) 
	{
		super();
		this.nombre = nombre;
	}

	@Override
	public void run() 
	{
		System.out.println("Inicio del Thread: " + this.getNombre());
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i + " " + this.nombre);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}