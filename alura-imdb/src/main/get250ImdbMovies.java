package main;

<<<<<<< HEAD
import main.Helpers.FileHandler;
=======
import main.helpers.FileHandler;
>>>>>>> 4eb60d79e4e3c06732a25dc26d40cf40759f8529
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class get250ImdbMovies {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        String apiKey = FileHandler.getApiKeyFromConfigFile();
=======
        final String apiKey = FileHandler.getApiKeyFromConfigFile();
>>>>>>> 4eb60d79e4e3c06732a25dc26d40cf40759f8529

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
