package ro.nicolaemariusghergu.backend.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.Product;
import ro.nicolaemariusghergu.backend.model.Shelf;
import ro.nicolaemariusghergu.backend.model.data.ShelfCategory;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, Long> {

    Optional<List<Shelf>> findAllByShelfCategory(ShelfCategory shelfCategory);

    Optional<List<Shelf>> findAllByProducts(Product product);
}
