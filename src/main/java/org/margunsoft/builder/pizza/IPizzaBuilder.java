package org.margunsoft.builder.pizza;

public interface IPizzaBuilder {
    void tipoPizza();
    void buildMasa();
    void buildSalsa();
    void buildIngredientes();
    Pizza getPizza();
}
