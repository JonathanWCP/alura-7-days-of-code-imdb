<<<<<<< HEAD
package main.Helpers;
=======
package main.helpers;
>>>>>>> 4eb60d79e4e3c06732a25dc26d40cf40759f8529

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandler {
    public static String getApiKeyFromConfigFile() throws Exception {
        final var workingDirectory = System.getProperty("user.dir");
        final var file = new File(workingDirectory + "\\alura-imdb\\src\\main\\config\\api-key.txt");

        final var bufferedReader = new BufferedReader(new FileReader(file));

        try {
            return bufferedReader.readLine();
        } catch (Exception ex) {
            throw new Exception("text file from 'src/main/config/api-key.txt' should contain public api key from IMDb");
        }
    }
}
