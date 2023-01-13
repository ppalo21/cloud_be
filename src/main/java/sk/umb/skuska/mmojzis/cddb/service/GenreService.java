package sk.umb.skuska.mmojzis.cddb.service;

import org.springframework.stereotype.Service;
import sk.umb.skuska.mmojzis.cddb.model.GenreRepository;
import sk.umb.skuska.mmojzis.cddb.model.entity.Genre;

import java.util.List;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Genre getById(Long id) {
        return genreRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Genre not found with ID: " + id));
    }

    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
