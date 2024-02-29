package org.margunsoft.factory.cuentasBancarias;

import java.util.HashMap;
import java.util.Map;

/**
 * Fábrica para crear cuentas bancarias
 */
public class CuentaFactory {
    private Map<String, Class<? extends Cuenta>> tiposDeCuenta = new HashMap<>();

    public void registrarTipoCuenta(String tipo, Class<? extends Cuenta> claseCuenta) {
        tiposDeCuenta.put(tipo, claseCuenta);
    }

    public Cuenta crearCuenta(String tipo) throws IllegalAccessException, InstantiationException {
        Class<? extends Cuenta> claseCuenta = tiposDeCuenta.get(tipo);
        if (claseCuenta == null) {
            throw new IllegalArgumentException("Tipo de cuenta no válido");
        }
        return claseCuenta.newInstance();
    }
}
