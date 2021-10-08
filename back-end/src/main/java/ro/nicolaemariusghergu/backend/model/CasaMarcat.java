package ro.nicolaemariusghergu.backend.model;

import lombok.Getter;
import lombok.Setter;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import javax.persistence.*;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "case_marcat")
public class CasaMarcat extends Entity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numar_casa_marcat")
    private Integer number;

    @Column(name = "bani_locali_casa_marcat")
    private Double localMoney;

    @JoinColumn(name = "type_pay_id", nullable = false)
    @ManyToOne
    private TypePay typePay;

    @JoinColumn(name = "type_status_id", nullable = false)
    @ManyToOne
    private TypeStatus typeStatus;
}
