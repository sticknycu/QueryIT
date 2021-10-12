package ro.nicolaemariusghergu.backend.service;

import org.springframework.lang.NonNull;
import ro.nicolaemariusghergu.backend.model.Minishop;
import ro.nicolaemariusghergu.backend.model.data.MinishopCategory;
import ro.nicolaemariusghergu.backend.model.data.Product;

import java.util.List;
import java.util.Optional;

public interface MinishopService {

    Optional<Minishop> findById(@NonNull Long id);

    List<Minishop> findAllByMinishopCategory(MinishopCategory minishopCategory);

    List<Minishop> findAllByProduct(Product product);
}
