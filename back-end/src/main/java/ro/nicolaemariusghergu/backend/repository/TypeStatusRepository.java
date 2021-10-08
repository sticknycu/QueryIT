package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import java.util.Optional;

public interface TypeStatusRepository extends JpaRepository<TypeStatus, Long> {

    @Override
    Optional<TypeStatus> findById(Long id);
}
