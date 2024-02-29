package org.margunsoft.builder.transaccionesFinancieras;

import java.util.Date;

/**
 * Concrete Builder
 */
public class TransaccionFinancieraBuilderImpl implements TransaccionFinancieraBuilder {
    private String tipo;
    private double monto;
    private Date fecha;
    private String descripcion;

    public TransaccionFinancieraBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public TransaccionFinancieraBuilder monto(double monto) {
        this.monto = monto;
        return this;
    }

    public TransaccionFinancieraBuilder fecha(Date fecha) {
        this.fecha = fecha;
        return this;
    }

    public TransaccionFinancieraBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public TransaccionFinanciera build() {
        TransaccionFinanciera transaccion = new TransaccionFinanciera(tipo, monto, fecha, descripcion);
        return transaccion;
    }
}
