package ro.nicolaemariusghergu.backend.model;

import lombok.*;
import ro.nicolaemariusghergu.backend.model.data.ShelfCategory;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shelves")
public class Shelf implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ShelfCategory shelfCategory;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "products_id", nullable = false)
    private Product products;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shelf shelf = (Shelf) o;
        return id.equals(shelf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
