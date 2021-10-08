package ro.nicolaemariusghergu.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import java.util.Optional;

@Repository
public interface CasaMarcatRepository extends JpaRepository<CasaMarcat, Long> {

    @NonNull
    @Override
    Optional<CasaMarcat> findById(@NonNull Long id);

    Optional<CasaMarcat> findByNumber(Integer number);

    Optional<CasaMarcat> findCasaMarcatByTypeStatus(TypeStatus typeStatus);

    Optional<CasaMarcat> findCasaMarcatByTypePay(TypePay typePay);

    Optional<CasaMarcat> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay);
}
