package org.margunsoft.builder.pizza;

public class PizzaBuilder implements IPizzaBuilder{
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void tipoPizza(){
        pizza.setTipo_pizza("Hawaiana");
    }
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    public void buildSalsa() {
        pizza.agregarSalsa("Tomate");
    }

    public void buildIngredientes() {
        pizza.agregarIngrediente("Jamón");
        pizza.agregarIngrediente("Piña");
    }

    public Pizza getPizza() {
        return pizza;
    }
}
