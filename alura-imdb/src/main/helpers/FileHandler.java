package main.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static String getApiKeyFromConfigFile() throws IOException {
        final var workingDirectory = System.getProperty("user.dir");
        final var file = new File(workingDirectory + "\\alura-imdb\\src\\main\\config\\api-key.txt");

        final var bufferedReader = new BufferedReader(new FileReader(file));

        try {
            return bufferedReader.readLine();
        } catch (Exception ex) {
            throw new IOException("text file from 'src/main/config/api-key.txt' should contain public api key from IMDb");
        }
    }
}
