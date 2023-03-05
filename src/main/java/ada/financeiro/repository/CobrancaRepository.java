package ada.financeiro.repository;

import ada.financeiro.entity.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {
}
