package ada.financeiro.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Pagamento")
public class PagamentoLocatario {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Locatario locatario;
    private LocalDate dataInclusao;
    private BigDecimal valorRepasse;
}
