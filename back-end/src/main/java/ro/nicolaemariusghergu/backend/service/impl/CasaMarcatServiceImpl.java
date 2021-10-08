package ro.nicolaemariusghergu.backend.service.impl;

import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.model.enums.TypePay;
import ro.nicolaemariusghergu.backend.model.enums.TypeStatus;
import ro.nicolaemariusghergu.backend.repository.CasaMarcatRepository;
import ro.nicolaemariusghergu.backend.service.CasaMarcatService;

import java.util.Optional;

@Service
public record CasaMarcatServiceImpl(CasaMarcatRepository casaMarcatRepository) implements CasaMarcatService {

    @Override
    public Optional<CasaMarcat> findById(Long id) {
        return casaMarcatRepository.findById(id);
    }

    @Override
    public Optional<CasaMarcat> findByNumber(Integer number) {
        return casaMarcatRepository.findByNumber(number);
    }

    @Override
    public Optional<CasaMarcat> findCasaMarcatByTypeStatus(TypeStatus typeStatus) {
        return casaMarcatRepository.findCasaMarcatByTypeStatus(typeStatus);
    }

    @Override
    public Optional<CasaMarcat> findCasaMarcatByTypePay(TypePay typePay) {
        return casaMarcatRepository.findCasaMarcatByTypePay(typePay);
    }

    @Override
    public Optional<CasaMarcat> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay) {
        return casaMarcatRepository.findCasaMarcatByTypeStatusAndTypePay(typeStatus, typePay);
    }
}
