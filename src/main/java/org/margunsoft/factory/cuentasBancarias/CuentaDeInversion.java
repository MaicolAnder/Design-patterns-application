package org.margunsoft.factory.cuentasBancarias;

public class CuentaDeInversion implements Cuenta {
    private final String tipo = "Cuenta de Inversión";
    private final double tasaGanancia = 0.05; // Tasa de ganancia anual para cuentas de inversión

    public String getInfo() {
        return tipo + " - Tasa de ganancia: " + tasaGanancia;
    }
}
