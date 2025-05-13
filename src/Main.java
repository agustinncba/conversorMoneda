import model.Moneda;
import service.ExchangeRateApi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
        Scanner input = new Scanner(System.in);
        int optionMenu;

        do {
            System.out.println("1. Dolar >> Peso Argentino");
            System.out.println("2. Peso Argentino >> Dolar");
            System.out.println("3. Dolar >> Real Brasileño");
            System.out.println("4. Real Brasileño >> Dolar");
            System.out.println("5. Dolar >> Peso Colombiano");
            System.out.println("6. Peso Colombiano >> Dolar");
            System.out.println("7. Salir");

            optionMenu = input.nextInt();
            System.out.println(">> Ingrese la cantidad que desea convertir");
            double cantidad = input.nextDouble();
            switch (optionMenu) {
                case 1:
                    Moneda moneda = exchangeRateApi.request("USD", "ARS");
                    double resultado = Double.parseDouble(moneda.getConversionRate()) * cantidad;
                    System.out.println(resultado);

                    break;
                case 2:
                    exchangeRateApi.request("ARS", "USD");
                    break;
                case 3:
                    exchangeRateApi.request("USD", "BRL");
                    break;
                case 4:
                    exchangeRateApi.request("BRL", "USD");
                    break;
                case 5:
                    exchangeRateApi.request("USD", "COP");
                    break;
                case 6:
                    exchangeRateApi.request("COP", "USD");
                    break;
            }
        } while (optionMenu != 7);

    }

    public double conversion(Moneda moneda, double cantidad) {
        return Double.parseDouble(moneda.getConversionRate()) * cantidad;
    }
}
