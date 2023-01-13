package sk.umb.skuska.mmojzis.cddb.controller;

import org.springframework.web.bind.annotation.*;
import sk.umb.skuska.mmojzis.cddb.controller.dto.CdDto;
import sk.umb.skuska.mmojzis.cddb.controller.dto.CdRequestDto;
import sk.umb.skuska.mmojzis.cddb.controller.dto.GenreDto;
import sk.umb.skuska.mmojzis.cddb.controller.dto.GenreRequestDto;
import sk.umb.skuska.mmojzis.cddb.model.entity.Cd;
import sk.umb.skuska.mmojzis.cddb.model.entity.Genre;
import sk.umb.skuska.mmojzis.cddb.service.CdService;
import sk.umb.skuska.mmojzis.cddb.service.GenreService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CdController {

    private final CdService cdService;

    private final GenreService genreService;

    public CdController(CdService cdService, GenreService genreService) {
        this.cdService = cdService;
        this.genreService = genreService;
    }

    @PostMapping("/genre")
    public GenreDto addGenre(@RequestBody GenreRequestDto dto) {
        Genre genre = Genre.builder().name(dto.getName()).build();
        genre = genreService.addGenre(genre);

        return GenreDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }

    @GetMapping("/genre")
    public List<GenreDto> getAllGenres() {
        List<GenreDto> dtos = new ArrayList<>();

        for (Genre genre : genreService.getAllGenres()) {
            dtos.add(GenreDto.builder()
                    .id(genre.getId())
                    .name(genre.getName())
                    .build());
        }

        return dtos;
    }

    @PostMapping("/cd")
    public CdDto addCd(@RequestBody CdRequestDto dto) {
        Cd cd = Cd.builder()
                .name(dto.getName())
                .author(dto.getAuthor())
                .genre(genreService.getById(dto.getGenreId()))
                .build();
        cd = cdService.addCd(cd);

        return CdDto.builder()
                .id(cd.getId())
                .name(cd.getName())
                .genreName(cd.getGenre().getName())
                .build();
    }

    @GetMapping("/cd")
    public List<CdDto> getAllCds() {
        List<CdDto> dtos = new ArrayList<>();

        for (Cd cd : cdService.getAllCds()) {
            dtos.add(CdDto.builder()
                    .id(cd.getId())
                    .author(cd.getAuthor())
                    .name(cd.getName())
                    .genreName(cd.getGenre().getName())
                    .build());
        }

        return dtos;
    }
}
