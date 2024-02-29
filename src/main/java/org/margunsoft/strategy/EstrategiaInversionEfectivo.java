package org.margunsoft.strategy;

/**
 * Estrategia de inversión en efectivo
 */
public class EstrategiaInversionEfectivo implements EstrategiaInversion {
    @Override
    public void invertir(double cantidad) {
        System.out.println("Mantener $" + cantidad + " en efectivo");
        // Aquí iría la lógica específica de mantener efectivo
    }
}
