package ro.nicolaemariusghergu.backend.service;

import ro.nicolaemariusghergu.backend.model.TypePay;

import java.util.Optional;

public interface TypePayService {

    Optional<TypePay> findById(Long id);

    Optional<TypePay> findByType(String type);
}
