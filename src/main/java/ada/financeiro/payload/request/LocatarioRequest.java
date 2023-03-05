package ada.financeiro.payload.request;

import ada.financeiro.entity.DadosBancarios;
import ada.financeiro.entity.TipoCliente;

import javax.validation.constraints.NotNull;

public class LocatarioRequest {
    private String identificador;
    private String nome;
    private String cpf;
    private TipoCliente tipoCliente;
    private DadosBancarios dadosBancarios;
}
