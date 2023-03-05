package ada.financeiro.payload.request;

import javax.validation.constraints.NotNull;

public class ClienteLocadorRequest {
    @NotNull
    private LocadorRequest locador;
}
