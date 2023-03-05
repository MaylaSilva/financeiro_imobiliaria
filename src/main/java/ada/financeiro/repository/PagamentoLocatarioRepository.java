package ada.financeiro.repository;

import ada.financeiro.entity.PagamentoLocatario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PagamentoLocatarioRepository extends JpaRepository<PagamentoLocatario, Long> {
    List<PagamentoLocatario> findPagamentoLocatarioByIdentificador(String identificadorLocatario);
}
