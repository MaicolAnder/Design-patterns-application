package org.margunsoft.observer.notificadorPrecioInversiones;

/**
 * Clase concreta de observador (inversor)
 */
public class Inversor implements Observer {
    private String nombre;

    public Inversor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(double precio) {
        System.out.println("[" + nombre + "] Notificación: El precio de la acción ha cambiado a " + precio);
    }
}
