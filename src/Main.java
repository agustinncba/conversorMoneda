import model.Moneda;
import service.ConversionService;
import service.ExchangeRateApi;
import utils.EntradaDatos;

public class Main {
    public static void main(String[] args) {
        EntradaDatos entradaDatos = new EntradaDatos();
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
        ConversionService conversionService = new ConversionService();

        int optionMenu;

        do {
            double cantidad = 0;
            Moneda moneda;
            double resultado;
            entradaDatos.mostrarMenu();
            optionMenu = entradaDatos.opcionMenu();

            switch (optionMenu) {
                case 1:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("USD", "ARS");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 2:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("ARS", "USD");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 3:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("USD", "BRL");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 4:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("BRL", "USD");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 5:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("USD", "COP");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 6:
                    cantidad = entradaDatos.cantidadAConvertir();
                    moneda = exchangeRateApi.request("COP", "USD");
                    resultado = conversionService.conversion(moneda, cantidad);
                    mensajeResultado(moneda, cantidad, resultado);
                    optionMenu = entradaDatos.volverAEjecutar();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("¡Intente nuevamente!");
                    break;
            }
        } while (optionMenu != 7);

    }

    /**
     * Muestra el mensaje con el resultado de la conversión.
     *
     * @param moneda Objeto Moneda que contiene la información de las monedas.
     * @param cantidad Cantidad original a convertir.
     * @param resultado Valor final después de la conversión.
     */
    static void mensajeResultado(Moneda moneda, double cantidad, double resultado) {
        System.out.println("\nEl valor de " + cantidad + " " + moneda.getBaseCode() +
                " corresponde al valor final de >> " + resultado + " " + moneda.getTargetCode());
    }

}
