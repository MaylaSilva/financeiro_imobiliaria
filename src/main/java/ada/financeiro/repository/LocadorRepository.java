package ada.financeiro.repository;

import ada.financeiro.entity.Locador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocadorRepository extends JpaRepository<Locador, Long> {
    Optional<Locador> findByIdentificador(String identificador);
}
