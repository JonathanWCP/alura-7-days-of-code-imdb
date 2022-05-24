package main.helpers;

import main.MovieInformation;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public List<String> GetInfoFromMovies(String[] moviesFromRequest, MovieInformation movieInformation) {
        List<String> movies = new ArrayList<String>();
        int titleIndex = 1;

        for (String movie : moviesFromRequest) {
            if (movie.contains(movieInformation.getInfo())) {

                var infoWithoutTwoPoints = movie.split(":");
                String formattedInfo = "";
                try {
                formattedInfo = infoWithoutTwoPoints[titleIndex].replace("\"", "");
                    if (infoWithoutTwoPoints[2] != null) {
                        formattedInfo += ":" + infoWithoutTwoPoints[2].replace("\"", "");
                    }
                }
                catch (Exception ex) { }
                movies.add(formattedInfo);
            }
        }

        return movies;
    }
}
