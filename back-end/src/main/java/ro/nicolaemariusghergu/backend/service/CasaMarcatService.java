package ro.nicolaemariusghergu.backend.service;

import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;

import java.util.Optional;

public interface CasaMarcatService {

    Optional<CasaMarcat> findById(Long id);

    Optional<CasaMarcat> findByNumber(Integer number);

    Optional<CasaMarcat> findCasaMarcatByTypeStatus(TypeStatus typeStatus);

    Optional<CasaMarcat> findCasaMarcatByTypePay(TypePay typePay);

    Optional<CasaMarcat> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay);
}
