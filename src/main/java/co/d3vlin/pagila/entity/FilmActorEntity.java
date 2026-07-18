package co.d3vlin.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(schema = "public", name = "film_actor")
@Getter
@Setter
public class FilmActorEntity {
    @EmbeddedId
    private FilmActorId id;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
