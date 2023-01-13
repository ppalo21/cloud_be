package sk.umb.skuska.mmojzis.cddb.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.umb.skuska.mmojzis.cddb.model.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
