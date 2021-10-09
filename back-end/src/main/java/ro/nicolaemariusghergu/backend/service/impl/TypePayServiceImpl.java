package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.TypePay;
import ro.nicolaemariusghergu.backend.repository.TypePayRepository;
import ro.nicolaemariusghergu.backend.service.TypePayService;

import java.util.Optional;

@Service
public record TypePayServiceImpl(TypePayRepository typePayRepository) implements TypePayService {

    @Override
    public Optional<TypePay> findById(Long id) {
        return typePayRepository.findById(id);
    }

    @Override
    public Optional<TypePay> findByType(String type) {
        return typePayRepository.findByType(type);
    }
}
