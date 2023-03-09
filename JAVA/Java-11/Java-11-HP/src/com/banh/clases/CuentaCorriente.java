package com.banh.clases;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > saldo + sobregiro) {
            System.out.println("No es posible realizar el retiro. Fondos insuficientes.");
        } else {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                sobregiro += (cantidad - saldo);
                saldo = 0;
            }
            numRetiros++;
        }
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                saldo += (cantidad - sobregiro);
                sobregiro = 0;
            }
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
        if (sobregiro > 0) {
            saldo -= sobregiro;
            sobregiro = 0;
        }
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}
