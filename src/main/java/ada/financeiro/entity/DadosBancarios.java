package ada.financeiro.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class DadosBancarios {
    @Id
    @GeneratedValue
    private long id;
    private long codigoBancario;
    private long agencia;
    private long numeroConta;
}
