package sk.umb.skuska.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.umb.skuska.model.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
