package org.margunsoft.builder.transaccionesFinancieras;

import java.util.Date;

/**
 * Builder
 * Interface para contruir
 */
public interface TransaccionFinancieraBuilder {
    TransaccionFinancieraBuilder tipo(String tipo);
    TransaccionFinancieraBuilder monto(double monto);
    TransaccionFinancieraBuilder fecha(Date fecha);
    TransaccionFinancieraBuilder descripcion(String descripcion);
    TransaccionFinanciera build();
}
