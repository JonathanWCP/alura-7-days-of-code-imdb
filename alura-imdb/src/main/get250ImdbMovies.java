package main;

import main.helpers.FileHandler;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class get250ImdbMovies {
    public static void main(String[] args) throws Exception {
        final String apiKey = FileHandler.getApiKeyFromConfigFile();

        final var imdbUri = "https://imdb-api.com/en/api/top250movies/" + apiKey;

        final var client = HttpClient.newHttpClient();
        final var request = HttpRequest
                .newBuilder(new URI(imdbUri))
                .GET()
                .build();

        final var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
