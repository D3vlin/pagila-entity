package co.d3vlin.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(schema = "public", name = "customer")
@Getter
@Setter
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    @ManyToOne
    @Column(name = "store_id")
    private StoreEntity storeEntity;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @Column(name = "address_id")
    private AddressEntity addressEntity;

    @Column(name = "activebool")
    private Boolean activeBool;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Column(name = "active")
    private Integer active;
}
