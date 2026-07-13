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

import java.time.LocalDateTime;

@Entity
@Table(schema = "public", name = "rental")
@Getter
@Setter
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer id;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @ManyToOne
    @Column(name = "inventory_id")
    private InventoryEntity inventoryEntity;

    @ManyToOne
    @Column(name = "customer_id")
    private CustomerEntity customerEntity;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @ManyToOne
    @Column(name = "staff_id")
    private StaffEntity staffEntity;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
