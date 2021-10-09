package ro.nicolaemariusghergu.backend.service.impl.data;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.data.TypePay;
import ro.nicolaemariusghergu.backend.repository.data.TypePayRepository;
import ro.nicolaemariusghergu.backend.service.data.TypePayService;

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
