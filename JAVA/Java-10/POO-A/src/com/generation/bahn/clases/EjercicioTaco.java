package com.generation.bahn.clases;

public class EjercicioTaco {
	String tipoDeTortilla,guisado,tamanioDeTortilla;
	int numeroDeTortilla;
	float precio;

	public EjercicioTaco() {

	}

	@Override //toString
	public String toString() {
		return "EjercicioTaco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", tamanioDeTortilla="
				+ tamanioDeTortilla + ", numeroDeTortilla=" + numeroDeTortilla + ", precio=" + precio + "] \n";
	}

	//get y set
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//Metodos
	public void vender() {
		System.out.println("Gracias por su compra");
	}

	public void preparar() {
		System.out.println("Preparando un taco de " + this.guisado + " con tortilla de " + this.tipoDeTortilla + 
				" (" + this.tamanioDeTortilla + "): " + this.numeroDeTortilla + " tortillas, $" + this.precio + " c/u.");
	}

	public float subirPrecio(float precio,float domicilio) {
		domicilio = precio + 10;
		System.out.println("Si lo quiere para llevar, son 10 extras, total para llevar: " +domicilio);
		return precio + 10;
	}

	public EjercicioTaco(String tipoDeTortilla, String guisado, String tamanioDeTortilla, int numeroDeTortilla,
			float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.numeroDeTortilla = numeroDeTortilla;
		this.precio = precio;
	}

}