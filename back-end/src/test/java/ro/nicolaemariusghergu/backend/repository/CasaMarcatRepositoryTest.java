package ro.nicolaemariusghergu.backend.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.nicolaemariusghergu.backend.exceptions.ResourceNotFoundException;
import ro.nicolaemariusghergu.backend.model.CasaMarcat;
import ro.nicolaemariusghergu.backend.service.CasaMarcatService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CasaMarcatRepositoryTest {

    private static final Integer number = 2;

    @Autowired
    CasaMarcatService casaMarcatService;

    @Autowired
    CasaMarcatRepository casaMarcatRepository;

    @Test
    void whenFindByNumberthenReturnCasaMarcatId() {
        // given
        CasaMarcat casaMarcat = new CasaMarcat();
        casaMarcat.setNumber(number);

        // when
        //doReturn(Optional.of(casaMarcat)).when(casaMarcatRepository).findByNumber(number);
        Optional<CasaMarcat> found = casaMarcatService.findByNumber(casaMarcat.getNumber());

        // then
        found.ifPresentOrElse(casaMarcatFounded -> {
            assertNotNull(casaMarcatFounded.getId());
        }, () -> {
            throw new ResourceNotFoundException("Resource requested has not been found");
        });
    }
}
