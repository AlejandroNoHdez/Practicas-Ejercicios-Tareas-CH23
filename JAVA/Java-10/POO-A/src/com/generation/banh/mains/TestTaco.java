package com.generation.banh.mains;

import com.generation.bahn.clases.EjercicioTaco;

public class TestTaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Objeto taquito usando el constructor vacio
		EjercicioTaco taquito = new EjercicioTaco();
		taquito.setGuisado("Carne asada");
		taquito.setNumeroDeTortilla(2);
		taquito.setPrecio(150);
		taquito.setTamanioDeTortilla("Sobaqueras");
		taquito.setTipoDeTortilla("Harina");

		//Objeto taquito 2 usando el constructor con todo
		EjercicioTaco taquito2 = new EjercicioTaco("Maiz","Hongos","Normales",2,20);


		// Imprimir el objeto taquito con get y set
		System.out.println("Su taco tiene un guiso de " +taquito.getGuisado() + " con "+taquito.getNumeroDeTortilla()+" tortillas " 
		+taquito.getTamanioDeTortilla() + " de " +taquito.getTipoDeTortilla()+ " con un costo total de " +taquito.getPrecio() +" pesos.");

		//Imprimir el objeto taquito con el método toString()
		System.out.println(taquito.toString()+"\n");


		// Imprimir el objeto taquito2 con metodo preparar
		taquito2.preparar();

		//Imprimir el objeto taquito2 con el método toString()
		System.out.println(taquito2.toString()+"\n");

		//llamamos metodo subir precio
		taquito2.subirPrecio(taquito2.getPrecio(),10);
	}

}