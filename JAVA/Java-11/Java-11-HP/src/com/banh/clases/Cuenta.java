package com.banh.clases;

public class Cuenta 
{
    protected float saldo;
    protected int numConsignaciones;
    protected int numRetiros;
    protected float tasaAnual;
    protected float comisionMensual;
    
    public Cuenta(float saldoInicial, float tasaAnual) 
    {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numConsignaciones = 0;
        this.numRetiros = 0;
        this.comisionMensual = 0;
    }
    
    public void consignar(float cantidad) {
        this.saldo += cantidad;
        this.numConsignaciones++;
    }
    
    public void retirar(float cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.numRetiros++;
        } else {
            System.out.println("No es posible retirar esa cantidad, el saldo es insuficiente.");
        }
    }
    
    public float calcularInteresMensual() {
        float interesMensual = this.saldo * (this.tasaAnual / 12)/100;
        this.saldo += interesMensual;
        return interesMensual;
    }
    
    public void extractoMensual() {
    	this.comisionMensual = calcularInteresMensual();
        this.saldo -= this.comisionMensual;
        
    }
    
    public void imprimir() {
        System.out.println("Saldo actual: " + this.saldo);
        System.out.println("Número de consignaciones: " + this.numConsignaciones);
        System.out.println("Número de retiros: " + this.numRetiros);
        System.out.println("Tasa anual: " + this.tasaAnual);
        System.out.println("Comisión mensual: " + this.comisionMensual);
    }

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
}