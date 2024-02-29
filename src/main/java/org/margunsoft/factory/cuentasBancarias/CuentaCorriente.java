package org.margunsoft.factory.cuentasBancarias;

public class CuentaCorriente implements Cuenta{
    private final String tipo = "Cuenta Corriente";
    private final double tarifaMantenimiento = 10; // Tarifa de mantenimiento mensual para cuentas corrientes

    public String getInfo() {
        return tipo + " - Tarifa de mantenimiento: " + tarifaMantenimiento;
    }
}
