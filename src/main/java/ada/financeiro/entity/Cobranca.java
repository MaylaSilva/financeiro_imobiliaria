package ada.financeiro.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Cobranca")
public class Cobranca {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Locador locador;
    private LocalDate dataInclusao;
    private BigDecimal valorAluguel;
}
