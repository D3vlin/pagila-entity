package co.d3vlin.pagila.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FilmActorId {
    @ManyToOne
    @JoinColumn(name = "actor_id")
    private ActorEntity actorEntity;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private FilmEntity filmEntity;
}
