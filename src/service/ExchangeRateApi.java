package service;

import model.Moneda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApi {

    /**
     * Realiza una petición a la API de tasas de cambio para obtener la tasa entre dos monedas.
     *
     * @param baseCode   Código de la moneda base (ej: USD).
     * @param targetCode Código de la moneda de destino (ej: EUR).
     * @return Moneda Objeto Moneda que contiene la información de la tasa de cambio.
     */
    public Moneda request(String baseCode, String targetCode) {
        String API_KEY = "";
        String API_URL = "https://v6.exchangerate-api.com/v6" +
                "/" + API_KEY +
                "/pair" +
                "/" + baseCode +
                "/" + targetCode;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();
        return response(client, request);
    }

    /**
     * Envía la petición HTTP y procesa la respuesta JSON de la API.
     *
     * @param client  Cliente HTTP para enviar la petición.
     * @param request Petición HTTP a enviar.
     * @return Moneda Objeto Moneda creado a partir de la respuesta JSON.
     * @throws RuntimeException Si ocurre un error durante la petición o el procesamiento de la respuesta.
     */
    public Moneda response(HttpClient client, HttpRequest request) {
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
            return gson.fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al realizar la petición a la API");
        }
    }

}