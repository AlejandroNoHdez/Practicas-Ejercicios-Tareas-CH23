package com.banh.testers;

import com.banh.clases.*;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaAhorros cuentaDeAhorros = new CuentaAhorros(100000, 0.10f);

        // Consignar $3000 a la cuenta
        cuentaDeAhorros.consignar(50000);

        // Retirar $500 de la cuenta
        cuentaDeAhorros.retirar(7000);

        // Realizar extracto mensual
        //cuentaDeAhorros.extractoMensual();

        // Imprimir los valores de los atributos de la cuenta
        cuentaDeAhorros.imprimir();
    }
}

