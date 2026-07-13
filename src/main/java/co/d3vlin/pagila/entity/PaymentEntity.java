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
@Table(schema = "public", name = "payment")
@Getter
@Setter
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer id;

    @ManyToOne
    @Column(name = "customer_id")
    private CustomerEntity customerEntity;

    @ManyToOne
    @Column(name = "staff_id")
    private StaffEntity staffEntity;

    @ManyToOne
    @Column(name = "rental_id")
    private RentalEntity rentalEntity;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;
}
