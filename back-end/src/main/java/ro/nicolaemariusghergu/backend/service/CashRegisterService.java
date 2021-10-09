package ro.nicolaemariusghergu.backend.service;

import ro.nicolaemariusghergu.backend.model.CashRegister;
import ro.nicolaemariusghergu.backend.model.data.TypePay;
import ro.nicolaemariusghergu.backend.model.data.TypeStatus;

import java.util.Optional;

public interface CashRegisterService {

    Optional<CashRegister> findById(Long id);

    Optional<CashRegister> findByNumber(Integer number);

    Optional<CashRegister> findCasaMarcatByTypeStatus(TypeStatus typeStatus);

    Optional<CashRegister> findCasaMarcatByTypePay(TypePay typePay);

    Optional<CashRegister> findCasaMarcatByTypeStatusAndTypePay(TypeStatus typeStatus, TypePay typePay);
}
