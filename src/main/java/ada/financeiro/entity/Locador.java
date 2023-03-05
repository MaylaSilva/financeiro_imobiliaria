package ada.financeiro.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Locador")
public class Locador {
    @Id
    @Generated
    private long id;
    private String identificador;
    private String nome;
    private String cpf;
    private TipoCliente tipoCliente;
}
