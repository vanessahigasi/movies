package tech.bts.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bts.movies.model.Movie;
import tech.bts.movies.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

   private MovieRepository movieRepo;
   private long nextId;

   @Autowired
   public MovieService(MovieRepository movieRepo) {
       this.movieRepo = movieRepo;
       nextId = 0;
   }

   public void addMovies(Movie movie) {

       movieRepo.getMovieMap().put(nextId, movie);
       nextId++;
   }

   public List<Movie> getAllMovies() {
       return new ArrayList<>(movieRepo.getMovieMap().values());
   }





}
