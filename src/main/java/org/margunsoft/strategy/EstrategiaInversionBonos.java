package org.margunsoft.strategy;

/**
 * Estrategia de inversión en bonos
 */
public class EstrategiaInversionBonos implements EstrategiaInversion {
    @Override
    public void invertir(double cantidad) {
        System.out.println("Inversión en bonos por $" + cantidad);
        // Aquí iría la lógica específica de inversión en bonos
    }
}
