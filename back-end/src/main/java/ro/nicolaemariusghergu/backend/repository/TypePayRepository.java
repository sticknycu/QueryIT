package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;

import java.util.Optional;

public interface TypePayRepository extends JpaRepository<TypePay, Long> {

    @Override
    Optional<TypePay> findById(Long id);
}
