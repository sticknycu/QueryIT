package ro.nicolaemariusghergu.backend.service.data;

import ro.nicolaemariusghergu.backend.model.data.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    List<Product> findAll();

    Optional<Product> findByName(String name);
}
