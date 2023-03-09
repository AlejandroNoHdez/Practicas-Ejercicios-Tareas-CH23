package com.banh.clases;

public class CuentaAhorros extends Cuenta {
    private boolean estaActiva;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        if (saldoInicial < 10000) {
            estaActiva = false;
        } else {
            estaActiva = true;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (estaActiva) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede consignar dinero.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (estaActiva) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede retirar dinero.");
        }
    }

    @Override
    public void extractoMensual() {
        int numRetiros = this.getNumRetiros();
        if (numRetiros > 4) {
            float comisionRetiros = (numRetiros - 4) * 1000;
            super.retirar(comisionRetiros);
            this.setComisionMensual(this.getComisionMensual() + comisionRetiros);
        }
        if (this.getSaldo() < 10000) {
            estaActiva = false;
        } else {
            estaActiva = true;
        }
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Comisión mensual: " + this.getComisionMensual());
        System.out.println("Número de transacciones: " + (this.getNumConsignaciones() + this.getNumRetiros()));
    }
}
