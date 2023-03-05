package ada.financeiro.repository;

import ada.financeiro.entity.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocatarioRepository extends JpaRepository<Locatario, Long> {
}
