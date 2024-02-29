package org.margunsoft.strategy;

/**
 * Contexto que utiliza una estrategia de inversión
 */
public class GestorDeInversion {
    private EstrategiaInversion estrategiaInversion;

    public void setEstrategiaInversion(EstrategiaInversion estrategiaInversion) {
        this.estrategiaInversion = estrategiaInversion;
    }

    public void ejecutarInversion(double cantidad) {
        if (estrategiaInversion != null) {
            estrategiaInversion.invertir(cantidad);
        } else {
            System.out.println("No se ha especificado una estrategia de inversión");
        }
    }
}
