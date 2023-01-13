package sk.umb.skuska.mmojzis.cddb.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cd {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String author;

    @ManyToOne(cascade = CascadeType.ALL)
    private Genre genre;

}
