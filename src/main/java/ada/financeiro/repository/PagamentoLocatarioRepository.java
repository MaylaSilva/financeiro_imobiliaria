package ada.financeiro.repository;

import ada.financeiro.entity.PagamentoLocatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoLocatarioRepository extends JpaRepository<PagamentoLocatario, Long> {
}
