package ada.financeiro.payload.request;

import javax.validation.constraints.NotNull;

public class ClienteLocatarioRequest {
    @NotNull
    private LocatarioRequest locatarioRequest;
}
