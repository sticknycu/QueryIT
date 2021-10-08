package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import java.util.Optional;

public interface CasaMarcatRepository extends JpaRepository<CasaMarcat, Long> {

    @Override
    Optional<CasaMarcat> findById(Long id);

    Optional<CasaMarcat> findCasaMarcatByTypeStatus(TypeStatus typeStatus);

    Optional<CasaMarcat> findCasaMarcatByTypePay(TypePay typePay);

    Optional<CasaMarcat> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay);
}
