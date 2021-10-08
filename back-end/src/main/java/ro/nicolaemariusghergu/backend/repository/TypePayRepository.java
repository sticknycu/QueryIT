package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;

import java.util.Optional;

@Repository
public interface TypePayRepository extends JpaRepository<TypePay, Long> {

    @Override
    Optional<TypePay> findById(Long id);
}
