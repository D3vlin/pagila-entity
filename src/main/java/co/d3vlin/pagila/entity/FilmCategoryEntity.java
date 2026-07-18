package co.d3vlin.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(schema = "public", name = "film_category")
@Getter
@Setter
public class FilmCategoryEntity {
    @EmbeddedId
    private FilmCategoryId id;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
