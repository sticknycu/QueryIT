package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.Product;
import ro.nicolaemariusghergu.backend.model.Shelf;
import ro.nicolaemariusghergu.backend.model.data.ShelfCategory;
import ro.nicolaemariusghergu.backend.repository.data.ShelfRepository;
import ro.nicolaemariusghergu.backend.service.ShelfService;

import java.util.List;
import java.util.Optional;

@Service
public record ShelfServiceImpl(ShelfRepository shelfRepository) implements ShelfService {

    @Override
    public Optional<List<Shelf>> findAllByShelfCategory(ShelfCategory shelfCategory) {
        return shelfRepository.findAllByShelfCategory(shelfCategory);
    }

    @Override
    public Optional<List<Shelf>> findAllByProducts(Product product) {
        return shelfRepository.findAllByProducts(product);
    }

    @Override
    public List<Shelf> findAll() {
        return shelfRepository.findAll();
    }
}
