package io.javabrain.moviedataservice.MovieRatingController;


import io.javabrain.moviedataservice.Models.MovieRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

    @RequestMapping("/{movieId}")
    public MovieRating getRating(@PathVariable("movieId") String movieId){
        return new MovieRating(movieId,"4");
    }



}
