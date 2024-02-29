package org.margunsoft.observer.notificadorPrecioInversiones;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase sujeto observable (la acción)
 */
public class Accion {
    private String nombre;
    private double precio;
    private List<Observer> observadores = new ArrayList<>();

    public Accion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void cambiarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(precio);
        }
    }
}
