package ro.nicolaemariusghergu.backend.service;

import ro.nicolaemariusghergu.backend.model.TypeStatus;

import java.util.Optional;

public interface TypeStatusService {

    Optional<TypeStatus> findById(Long id);

    Optional<TypeStatus> findByType(String type);
}
