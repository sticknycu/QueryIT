package ro.nicolaemariusghergu.backend.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.data.MinishopCategory;

import java.util.List;
import java.util.Optional;

@Repository
public interface MinishopCategoryRepository extends JpaRepository<MinishopCategory, Long> {

    @NonNull
    @Override
    MinishopCategory getById(@NonNull Long id);

    Optional<MinishopCategory> getByName(String name);

    @NonNull
    @Override
    List<MinishopCategory> findAll();
}
