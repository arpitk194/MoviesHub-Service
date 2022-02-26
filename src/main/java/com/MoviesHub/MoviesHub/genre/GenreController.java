package com.MoviesHub.MoviesHub.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping(path = "/genres")
    public List<Genre> getGenres() {
        return genreService.findAllGenres();
    }
}
