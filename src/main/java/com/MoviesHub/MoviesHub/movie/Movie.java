package com.MoviesHub.MoviesHub.movie;

import com.MoviesHub.MoviesHub.genre.Genre;

import javax.persistence.Id;

public class Movie {

    @Id
    private Long id;
    private String title;
    private Genre genre;
    private Integer numberInStock;
    private Integer dailyRentalRate;

}
