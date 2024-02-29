package org.margunsoft;

import org.margunsoft.builder.pizza.MaestroPizzero;
import org.margunsoft.builder.pizza.Pizza;
import org.margunsoft.builder.pizza.PizzaBuilder;
import org.margunsoft.builder.transaccionesFinancieras.TransaccionFinanciera;
import org.margunsoft.builder.transaccionesFinancieras.TransaccionFinancieraBuilderImpl;
import org.margunsoft.factory.cuentasBancarias.*;
import org.margunsoft.observer.notificadorPrecioInversiones.Accion;
import org.margunsoft.observer.notificadorPrecioInversiones.Inversor;
import org.margunsoft.strategy.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Implementación del patron Builder
        builder_transaccionFinanciera();

        // Implementación del patron Factory
        try {
            factory_cuentaBancarias();
        } catch (IllegalAccessException e) {

        } catch (InstantiationException e) {

        }

        // Implementación del patron observador
        observer_precioInversiones();

        // Implementación del patron strategy
        strategy_gestorInversiones();
    }

    /**
     * gestión de cartera que utiliza diferentes estrategias de inversión
     * para determinar cómo asignar los fondos entre diferentes tipos de activos,
     * como acciones, bonos y efectivo.
     */
    public static void strategy_gestorInversiones(){
        System.out.println("\n********** Patron Strategy **********");
        // Crear instancias de las estrategias de inversión
        EstrategiaInversion estrategiaAcciones = new EstrategiaInversionAcciones();
        EstrategiaInversion estrategiaBonos = new EstrategiaInversionBonos();
        EstrategiaInversion estrategiaEfectivo = new EstrategiaInversionEfectivo();

        // Crear un gestor de inversiones
        GestorDeInversion gestorDeInversion = new GestorDeInversion();

        // Configurar y ejecutar la estrategia de inversión en acciones
        gestorDeInversion.setEstrategiaInversion(estrategiaAcciones);
        gestorDeInversion.ejecutarInversion(5000);

        // Configurar y ejecutar la estrategia de inversión en bonos
        gestorDeInversion.setEstrategiaInversion(estrategiaBonos);
        gestorDeInversion.ejecutarInversion(3000);

        // Configurar y ejecutar la estrategia de inversión en efectivo
        gestorDeInversion.setEstrategiaInversion(estrategiaEfectivo);
        gestorDeInversion.ejecutarInversion(2000);
    }
    public static void observer_precioInversiones(){
        System.out.println("\n********** Patron Observer **********");

        // Crear una acción (sujeto observable)
        Accion accion = new Accion("ABC", 100.0);

        // Crear inversores (observadores)
        Inversor inversor1 = new Inversor("Inversor1");
        Inversor inversor2 = new Inversor("Inversor2");

        // Suscribir inversores para recibir actualizaciones de precios
        accion.agregarObservador(inversor1);
        accion.agregarObservador(inversor2);

        // Cambiar el precio de la acción y notificar a los inversores
        accion.cambiarPrecio(105.0);
        accion.cambiarPrecio(110.0);

        // Retirar un inversor de la lista de observadores
        accion.eliminarObservador(inversor1);

        // Cambiar el precio de la acción nuevamente
        accion.cambiarPrecio(115.0);
    }
    public static void factory_cuentaBancarias() throws IllegalAccessException, InstantiationException{
        System.out.println("\n********** Patron Factory **********");

        // Crear una instancia de la fábrica y registrar los tipos de cuenta
        CuentaFactory factory = new CuentaFactory();
        factory.registrarTipoCuenta("ahorro", CuentaDeAhorro.class);
        factory.registrarTipoCuenta("corriente", CuentaCorriente.class);
        factory.registrarTipoCuenta("inversion", CuentaDeInversion.class);

        // Crear cuentas utilizando la fábrica
        Cuenta cuentaAhorro = factory.crearCuenta("ahorro");
        Cuenta cuentaCorriente = factory.crearCuenta("corriente");
        Cuenta cuentaInversion = factory.crearCuenta("inversion");

        // Imprimir la información de las cuentas
        System.out.println(cuentaAhorro.getInfo());
        System.out.println(cuentaCorriente.getInfo());
        System.out.println(cuentaInversion.getInfo());
    }
    public static void builder_transaccionFinanciera(){
        System.out.println("\n********** Patron Builder **********");

        // Llamar implementación Builder
        TransaccionFinancieraBuilderImpl builderTransaccion = new TransaccionFinancieraBuilderImpl();
        // Cliente
        TransaccionFinanciera transaccion = builderTransaccion
                .tipo("Compra")
                .monto(1000.0)
                .fecha(new Date())
                .descripcion("Compra de acciones").build();

        transaccion.mostrar(); // Mostrar Producto Construido
    }
    public void builder_Pizza(){
        System.out.println("******* Patron Builder PIZZA! *******");
        // Llamar director
        MaestroPizzero pizzero = new MaestroPizzero();

        // Constrir producto
        PizzaBuilder pizzaHawaiana = new PizzaBuilder();
        pizzero.setPizzaBuilder(pizzaHawaiana);
        pizzero.construirPizza();

        Pizza pizza = pizzero.getPizza();
        pizza.mostrar();
    }
}