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
@Table(schema = "public", name = "store")
@Getter
@Setter
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Integer id;

    @ManyToOne
    @Column(name = "manager_staff_id")
    private StaffEntity managerStaffEntity;

    @ManyToOne
    @Column(name = "address_id")
    private AddressEntity addressEntity;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
