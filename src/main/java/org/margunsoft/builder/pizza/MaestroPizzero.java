package org.margunsoft.builder.pizza;

/**
 * Clase Director
 */
public class MaestroPizzero {
    private IPizzaBuilder ipizzaBuilder;

    public void setPizzaBuilder(IPizzaBuilder ipizzaBuilder) {
        this.ipizzaBuilder = ipizzaBuilder;
    }

    public Pizza getPizza() {
        return ipizzaBuilder.getPizza();
    }

    public void construirPizza() {
        ipizzaBuilder.tipoPizza();
        ipizzaBuilder.buildMasa();
        ipizzaBuilder.buildSalsa();
        ipizzaBuilder.buildIngredientes();
    }
}
