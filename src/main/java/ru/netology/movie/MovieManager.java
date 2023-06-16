package ru.netology.movie;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;

    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] FindAll() {
        return movies;
    }

    public String[] FindLast() {
        int resoultLength;
        if (movies.length < limit) {
            resoultLength = movies.length;
        } else {
            resoultLength = limit;

        }


        String[] tmp = new String[resoultLength]; //resoultLength
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
