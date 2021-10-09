package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.TypeStatus;
import ro.nicolaemariusghergu.backend.repository.TypeStatusRepository;
import ro.nicolaemariusghergu.backend.service.TypeStatusService;

import java.util.Optional;

@Service
public record TypeStatusServiceImpl(TypeStatusRepository typeStatusRepository) implements TypeStatusService {

    @Override
    public Optional<TypeStatus> findById(Long id) {
        return typeStatusRepository.findById(id);
    }

    @Override
    public Optional<TypeStatus> findByType(String type) {
        return typeStatusRepository.findByType(type);
    }
}

