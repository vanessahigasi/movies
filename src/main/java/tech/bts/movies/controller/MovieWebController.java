package tech.bts.movies.controller;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.movies.model.Movie;
import tech.bts.movies.service.MovieService;
import tech.bts.movies.util.HandlebarsUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/movies")
public class MovieWebController {

    private MovieService movieService;

    @Autowired
    public MovieWebController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(method = GET)
    public String getAllMovies() throws IOException {

        Template template = HandlebarsUtil.compile("movie-list");
        Map<String, Object> values = new HashMap<>();
        values.put("movies",movieService.getAllMovies());
        return template.apply(values);
    }

}
