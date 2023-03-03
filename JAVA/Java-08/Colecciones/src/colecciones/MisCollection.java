package colecciones;

import java.util.*;

public class MisCollection 
{

	public static void main(String[] args) 
	{
		MisCollection c = new MisCollection();
		
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		//imprimir(c.setTreeSet());
		imprimir(mapCollections().values());
		//wrapperClass();
	}
	
	private static Map mapCollections()
	{
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		miMap.remove("valor3");
		
		return miMap;
	}
	
	Set setCollections()
	{
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		
		return miSet;
	}
	
	
	Set setTreeSet()
	{
		Set<Integer> miSet = new TreeSet();
		miSet.add(5);
		miSet.add(8);
		
		miSet.clear();
		
		miSet.add(10);
		miSet.add(2);
		miSet.add(20);
		miSet.add(14);
		
		Integer[] array = miSet.toArray(new Integer[miSet.size()]);

        System.out.println("Array resultante:");
        for (Integer elemento : array) 
        {
            System.out.println(elemento);
        }
		
		return miSet;
	}
	

	private List listaCollections() 
	{
		//no se puede crear una instancia de una interfaz
		//solo se puede declarar un objeto
		//la clase abstracta puede ser extendida solo una vez y es padre-hija, siempre
		List miLista = new ArrayList();
		System.out.println("Tamaño de la lista antes: " + miLista.size());
		System.out.println("Esta vacía? " + miLista.isEmpty());
		
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0,"Pato");
		
		miLista.set(0,miLista);
		miLista.remove(2);
		
		System.out.println("Tamaño de la lista después: " + miLista.size());
		System.out.println("Esta vacía? " + miLista.isEmpty());
		
		boolean e = miLista.contains(2);
		System.out.println("---> " + e);
		
		return miLista;
	}
	
	private static void imprimir(Collection collection) 
	{
		for (Object elementos : collection) 
		{
			System.out.println("Elementos: " + elementos);
		}
	}

	static void wrapperClass() 
	{ //static genera el objeto
		//byte, short, char, long, float, int, double
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);

		int numeroI = -2147483648;
		System.out.println("Tamaño de un byte: " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor Max " + Integer.MAX_VALUE);
		System.out.println("Valor Min " + Integer.MIN_VALUE);
		System.out.println("---> " + numeroI);

		//Wrapper es una clase que potencializan a otras clases
		//U otras estructuras de datos primitivas, como arreglos

		short numeroA = 16;
		System.out.println("Tamaño de un byte: " + Short.BYTES);
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor Max " + Short.MAX_VALUE);
		System.out.println("Valor Min " + Short.MIN_VALUE);
		System.out.println("---> " + numeroA);

		long numeroC = 64;
		System.out.println("Tamaño de un byte: " + Long.BYTES);
		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor Max " + Long.MAX_VALUE);
		System.out.println("Valor Min " + Long.MIN_VALUE);
		System.out.println("---> " + numeroC);

		float numeroD = 15;
		System.out.println("Tamaño de un byte: " + Float.BYTES);
		System.out.println("Tamaño de un float " + Float.SIZE);
		System.out.println("Valor Max " + Float.MAX_VALUE);
		System.out.println("Valor Min " + Float.MIN_VALUE);
		System.out.println("---> " + numeroD);
	}

}