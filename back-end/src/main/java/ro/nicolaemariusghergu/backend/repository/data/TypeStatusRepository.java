package ro.nicolaemariusghergu.backend.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.data.TypeStatus;

import java.util.Optional;

@Repository
public interface TypeStatusRepository extends JpaRepository<TypeStatus, Long> {

    @NonNull
    @Override
    Optional<TypeStatus> findById(@NonNull Long id);

    Optional<TypeStatus> findByType(String type);
}
