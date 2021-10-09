package ro.nicolaemariusghergu.backend.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.nicolaemariusghergu.backend.exceptions.ResourceNotFoundException;
import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.model.TypePay;
import ro.nicolaemariusghergu.backend.model.TypeStatus;
import ro.nicolaemariusghergu.backend.repository.CasaMarcatRepository;
import ro.nicolaemariusghergu.backend.service.CasaMarcatService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CasaMarcatServiceImplTest {

    private static final Long ID = 1L;
    private static final Integer NUMBER = 2;

    @Autowired
    CasaMarcatService casaMarcatService;

    @Test
    void whenFindByIdthenReturnCasaMarcat() {
        // given
        CasaMarcat casaMarcat = new CasaMarcat();
        casaMarcat.setId(ID);

        // when - Without Mock
        Optional<CasaMarcat> found = casaMarcatService.findById(casaMarcat.getId());

        // then
        found.ifPresentOrElse(casaMarcatFounded -> {
            assertNotNull(casaMarcatFounded.getNumber());
            assertNotNull(casaMarcatFounded.getName());
            assertNotNull(casaMarcatFounded.getTypePay());
            assertNotNull(casaMarcatFounded.getTypeStatus());
        }, () -> {
            throw new ResourceNotFoundException("Resource requested has not been found");
        });
    }

    @Test
    void whenFindByNumberthenReturnCasaMarcat() {
        // given
        CasaMarcat casaMarcat = new CasaMarcat();
        casaMarcat.setNumber(NUMBER);

        // when - Without Mock
        Optional<CasaMarcat> found = casaMarcatService.findByNumber(casaMarcat.getNumber());

        // then
        found.ifPresentOrElse(casaMarcatFounded -> {
            assertNotNull(casaMarcatFounded.getNumber());
            assertNotNull(casaMarcatFounded.getName());
            assertNotNull(casaMarcatFounded.getTypePay());
            assertNotNull(casaMarcatFounded.getTypeStatus());
        }, () -> {
            throw new ResourceNotFoundException("Resource requested has not been found");
        });
    }

    @Test
    void whenFindByTypeStatusAndTypePayExiststhenReturnCasaMarcat() {
        TypeStatus typeStatus = new TypeStatus();
        typeStatus.setId(ID);

        TypePay typePay = new TypePay();
        typePay.setId(ID);

        // given
        CasaMarcat casaMarcat = new CasaMarcat();
        casaMarcat.setTypeStatus(typeStatus);
        casaMarcat.setTypePay(typePay);

        // when - Without Mock
        Optional<CasaMarcat> found = casaMarcatService.findCasaMarcatByTypeStatusAndTypePay(casaMarcat.getTypeStatus(), typePay);

        // then
        found.ifPresentOrElse(casaMarcatFounded -> {
            assertNotNull(casaMarcatFounded.getNumber());
            assertNotNull(casaMarcatFounded.getName());
            assertNotNull(casaMarcatFounded.getTypePay());
            assertNotNull(casaMarcatFounded.getTypeStatus());
        }, () -> {
            throw new ResourceNotFoundException("Resource requested has not been found");
        });
    }
}
