package co.d3vlin.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(schema = "public", name = "city")
@Getter
@Setter
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer id;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryEntity countryEntity;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
