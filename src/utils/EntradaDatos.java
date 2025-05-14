package utils;

import java.util.Scanner;

public class EntradaDatos {
    Scanner input = new Scanner(System.in);

    public void mostrarMenu() {
        String separador = "--------------------------------------";
        System.out.println(separador);
        System.out.println("Conversor de Monedas");
        System.out.println(separador);
        System.out.println("1. Dolar >> Peso Argentino");
        System.out.println("2. Peso Argentino >> Dolar");
        System.out.println("3. Dolar >> Real Brasileño");
        System.out.println("4. Real Brasileño >> Dolar");
        System.out.println("5. Dolar >> Peso Colombiano");
        System.out.println("6. Peso Colombiano >> Dolar");
        System.out.println("7. Salir");
        System.out.println(separador);
    }

    public int opcionMenu() {
        System.out.println("Elija una opcion valida");
        System.out.print(">> ");
        return input.nextInt();
    }

    public double cantidadAConvertir() {
        System.out.println("Ingrese el valor que desea convertir");
        System.out.print(">> ");
        return input.nextDouble();
    }

    /**
     * Pregunta al usuario si desea realizar otra conversión.
     *
     * @return int 0 si el usuario desea continuar, 7 si desea salir.
     */
    public int volverAEjecutar() {
        String ejecutar;
        while (true) {
            System.out.println("\n¿Volver a ejecutar el conversor? (S/N)");
            System.out.print(">> ");
            ejecutar = input.next();

            if (ejecutar.equalsIgnoreCase("s")) {
                return 0;
            } else if (ejecutar.equalsIgnoreCase("n")) {
                System.out.println("¡Vuelve pronto!");
                return 7;
            } else {
                System.out.println("¡Intente nuevamente!");
            }
        }
    }
}
