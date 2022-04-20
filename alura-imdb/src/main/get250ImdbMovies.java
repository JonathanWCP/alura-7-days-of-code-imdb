package main;

import main.helpers.FileHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class get250ImdbMovies {
    public static void main(String[] args) throws Exception {
        final String apiKey = FileHandler.getApiKeyFromConfigFile();
        final var imdbUri = "https://imdb-api.com/en/api/top250movies/" + apiKey;

        final var client = HttpClient.newHttpClient();

        final HttpResponse<String> response;
        try {
            final var request = HttpRequest
                    .newBuilder(new URI(imdbUri))
                    .GET()
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch (URISyntaxException ex) {
            throw new URISyntaxException(apiKey, "The api key should be a valid IMDb public api key!");
        }
        catch (Exception ex) {
            throw new Exception("A problem occurred: " + ex.getMessage());
        }

        System.out.println(response.body());
    }
}
