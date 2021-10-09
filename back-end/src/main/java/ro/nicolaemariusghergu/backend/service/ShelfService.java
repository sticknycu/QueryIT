package ro.nicolaemariusghergu.backend.service;

import ro.nicolaemariusghergu.backend.model.Product;
import ro.nicolaemariusghergu.backend.model.Shelf;
import ro.nicolaemariusghergu.backend.model.data.ShelfCategory;

import java.util.List;
import java.util.Optional;

public interface ShelfService {

    Optional<List<Shelf>> findAllByShelfCategory(ShelfCategory shelfCategory);

    Optional<List<Shelf>> findAllByProducts(Product product);

    List<Shelf> findAll();
}
