package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.Minishop;
import ro.nicolaemariusghergu.backend.model.data.MinishopCategory;
import ro.nicolaemariusghergu.backend.model.data.Product;
import ro.nicolaemariusghergu.backend.repository.MinishopRepository;
import ro.nicolaemariusghergu.backend.service.MinishopService;

import java.util.List;
import java.util.Optional;

@Service
public record MinishopServiceImpl(MinishopRepository minishopRepository) implements MinishopService {

    @Override
    public Optional<Minishop> findById(Long id) {
        return minishopRepository.findById(id);
    }

    @Override
    public List<Minishop> findAllByMinishopCategory(MinishopCategory minishopCategory) {
        return minishopRepository.findAllByMinishopCategory(minishopCategory);
    }

    @Override
    public List<Minishop> findAllByProduct(Product product) {
        return minishopRepository.findAllByProduct(product);
    }
}
