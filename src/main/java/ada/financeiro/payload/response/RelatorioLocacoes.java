package ada.financeiro.payload.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RelatorioLocacoes {
    private BigDecimal valor;
    private String identificador;
}
