package ada.financeiro.repository;

import ada.financeiro.entity.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocatarioRepository extends JpaRepository<Locatario, Long> {
    Optional<Locatario> findByIdentificador(String identificador);
}
