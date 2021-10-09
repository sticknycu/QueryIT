package ro.nicolaemariusghergu.backend.service.data;

import ro.nicolaemariusghergu.backend.model.data.TypeStatus;

import java.util.Optional;

public interface TypeStatusService {

    Optional<TypeStatus> findById(Long id);

    Optional<TypeStatus> findByType(String type);
}
