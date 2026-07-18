package co.d3vlin.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.time.Year;
import java.util.List;

@Entity
@Table(schema = "public", name = "film")
@Getter
@Setter
public class FilmEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Year releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private LanguageEntity languageEntity;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private LanguageEntity originalLanguageEntity;

    @Column(name = "rental_duration")
    private Integer rentalDuration;

    @Column(name = "rental_rate")
    private Double rentalRate;

    @Column(name = "length")
    private Integer length;

    @Column(name = "replacement_cost")
    private Double replacementCost;

    @Column(name = "rating")
    @Enumerated(EnumType.STRING)
    @JdbcTypeCode(Types.OTHER)
    private EMpaaRating rating;

    @Column(name = "last_update")
    private java.time.LocalDateTime lastUpdate;

    @Column(name = "special_features")
    private List<String> specialFeatures;

    @Column(name = "fulltext")
    private String fullText;
}
