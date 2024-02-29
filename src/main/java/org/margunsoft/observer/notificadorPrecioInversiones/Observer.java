package org.margunsoft.observer.notificadorPrecioInversiones;

// Interfaz para los observadores (inversores)
interface Observer {
    void actualizar(double precio);
}