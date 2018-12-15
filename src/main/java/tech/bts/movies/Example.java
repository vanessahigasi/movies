package tech.bts.movies;

import tech.bts.movies.model.Movie;
import tech.bts.movies.repository.MovieRepository;
import tech.bts.movies.service.MovieService;

public class Example {


    public static void main(String[] args) {

        MovieService m = new MovieService(new MovieRepository());

        m.addMovies(new Movie("Batman",120,true));
        m.addMovies(new Movie("X Man",130,false));


        System.out.println(m.getAllMovies());

    }
}
