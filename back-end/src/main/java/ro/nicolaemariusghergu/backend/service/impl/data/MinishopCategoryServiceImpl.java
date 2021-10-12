package ro.nicolaemariusghergu.backend.service.impl.data;

import ro.nicolaemariusghergu.backend.model.data.MinishopCategory;
import ro.nicolaemariusghergu.backend.repository.data.MinishopCategoryRepository;
import ro.nicolaemariusghergu.backend.service.data.MinishopCategoryService;

import java.util.List;
import java.util.Optional;

public record MinishopCategoryServiceImpl(MinishopCategoryRepository minishopCategoryRepository) implements MinishopCategoryService {

    @Override
    public MinishopCategory getById(Long id) {
        return minishopCategoryRepository.getById(id);
    }

    @Override
    public Optional<MinishopCategory> getByName(String name) {
        return minishopCategoryRepository.getByName(name);
    }

    @Override
    public List<MinishopCategory> findAll() {
        return minishopCategoryRepository.findAll();
    }
}
