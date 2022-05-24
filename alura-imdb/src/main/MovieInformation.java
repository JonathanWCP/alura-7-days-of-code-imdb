package main;

public enum MovieInformation {
    ID("id"),
    RANK("rank"),
    TITLE("title"),
    FULL_TITLE("fullTitle"),
    YEAR("year"),
    IMAGE("image"),
    CREW("crew"),
    IMDB_RATING("imDbRating"),
    IMDB_RATING_COUNT("imDbRatingCount");

    private final String info;

    MovieInformation(String informationName){
        info = informationName;
    }

    public String getInfo() {
        return info;
    }
}
