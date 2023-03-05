package ada.financeiro.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Locatario")
public class Locatario {
    @Id
    @Generated
    private long id;
    private String identificador;
    private String nome;
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dadosBancarios_id")
    private DadosBancarios dadosBancarios;

    private TipoCliente tipoCliente;
}
