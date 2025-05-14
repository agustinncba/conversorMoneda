# Conversor de Monedas (Challenge ONE)

Simple conversor de monedas en Java como parte del challenge ONE. Permite la conversión entre algunas monedas populares utilizando datos de una API externa (ExchangeRate-API).

## Funcionalidades

* Convierte entre USD, ARS, BRL y COP.
* Interfaz de consola interactiva.

## Ejecución

1.  Clonar (opcional): `git clone https://github.com/agustinncba/conversorMoneda.git`
2.  Compilar: `javac src/*.java src/model/*.java src/service/*.java src/utils/*.java`
3.  Ejecutar: `java src/Main`

## Dependencias

* Gson (incluir JAR en `lib/` o gestionar con Maven/Gradle).

## API

* [ExchangeRate-API](https://www.exchangerate-api.com/) (clave codificada en `ExchangeRateApi.java`).