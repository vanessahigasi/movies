package tech.bts.movies.model;

public class Movie {

    private String title;
    private int length;
    private boolean adult;

    public Movie(String title, int length, boolean adult) {
        this.title = title;
        this.length = length;
        this.adult = adult;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public boolean isAdult() {
        return adult;
    }

    @Override
    public String toString() {
        return "Movie " + title + ", " + length + " min" + " for adults " + adult;
    }
}
