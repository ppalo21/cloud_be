package sk.umb.skuska.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.umb.skuska.model.entity.Cd;

@Repository
public interface CdRepository extends JpaRepository<Cd, Long> {
}
