package service;

import model.Moneda;

public class ConversionService {

    /**
     * Recibe una moneda y una cantidad, y devuelve el resultado de la conversión.
     *
     * @param moneda   Objeto Moneda que contiene la tasa de cambio.
     * @param cantidad Cantidad a convertir.
     * @return double El resultado de la conversión.
     */
    public double conversion(Moneda moneda, double cantidad) {
        return Double.parseDouble(moneda.getConversionRate()) * cantidad;
    }
}