package org.margunsoft.strategy;

/**
 * Estrategia de inversión en acciones
 */
public class EstrategiaInversionAcciones implements EstrategiaInversion {
    @Override
    public void invertir(double cantidad) {
        System.out.println("Inversión en acciones por $" + cantidad);
        // Aquí iría la lógica específica de inversión en acciones
    }
}
