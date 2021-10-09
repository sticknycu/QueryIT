package ro.nicolaemariusghergu.backend.service.data;

import ro.nicolaemariusghergu.backend.model.data.TypePay;

import java.util.Optional;

public interface TypePayService {

    Optional<TypePay> findById(Long id);

    Optional<TypePay> findByType(String type);
}
