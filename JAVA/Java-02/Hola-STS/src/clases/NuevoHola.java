package clases;

public class NuevoHola 
{	
	private String nombre;
	//Para inicializar la variable (objeto de tipo String) usamos el método constructor

	public NuevoHola() 
	{
	}
	
	public NuevoHola(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void saludar()
	{
		System.out.println("Hola desde Java con STS de nuez " + this.nombre);
	}
	
	public void saludoConNombre(String nombre)
	{
		System.out.println("Hola estimado: " + nombre);
	}
}