package org.margunsoft.builder.transaccionesFinancieras;

import java.util.Date;

/**
 * Producto
 * @author Miguel A Tunubalá
 */
public class TransaccionFinanciera {
    private String tipo;
    private double monto;
    private Date fecha;
    private String descripcion;

    public TransaccionFinanciera(String tipo, double monto, Date fecha, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrar() {
        System.out.println("Transacción:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: " + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("Descripción: " + descripcion);
    }
}
