package ro.nicolaemariusghergu.backend.model;

import lombok.*;
import org.hibernate.Hibernate;
import ro.nicolaemariusghergu.backend.model.data.TypePay;
import ro.nicolaemariusghergu.backend.model.data.TypeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@javax.persistence.Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cash_register")
public class CashRegister extends Entity implements Serializable {

    private static final String NAME = "Casa de Marcat";

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cash_register_number")
    private Integer number;

    @Column(name = "local_money_cash_register")
    private Double localMoney;

    @ToString.Exclude
    @JoinColumn(name = "type_pay_id", nullable = false)
    @ManyToOne
    private TypePay typePay;

    @ToString.Exclude
    @JoinColumn(name = "type_status_id", nullable = false)
    @ManyToOne
    private TypeStatus typeStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CashRegister that = (CashRegister) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
