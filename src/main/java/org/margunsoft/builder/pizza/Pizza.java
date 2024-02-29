package org.margunsoft.builder.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Producto
 * @author Miguel A Tunubalá
 */
public class Pizza {
    private String tipo_pizza;
    private String masa;
    private List<String> salsas;
    private List<String> ingredientes;

    public Pizza() {
        this.salsas = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
    }

    public void setTipo_pizza(String tipo_pizza) {
        this.tipo_pizza = tipo_pizza;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void agregarSalsa(String salsa) {
        this.salsas.add(salsa);
    }

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void mostrar() {
        System.out.println("Pizza Construida:" + tipo_pizza);
        System.out.println("Masa: " + masa);
        System.out.println("Salsas:");
        for (String salsa : salsas) {
            System.out.println("- " + salsa);
        }
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
}
