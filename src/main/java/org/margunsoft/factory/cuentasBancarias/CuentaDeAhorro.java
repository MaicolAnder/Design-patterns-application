package org.margunsoft.factory.cuentasBancarias;

public class CuentaDeAhorro implements Cuenta {
    private final String tipo = "Cuenta de Ahorro";
    private final double interes = 0.02; // Tasa de interés para cuentas de ahorro

    public String getInfo() {
        return tipo + " - Tasa de interés: " + interes;
    }
}
