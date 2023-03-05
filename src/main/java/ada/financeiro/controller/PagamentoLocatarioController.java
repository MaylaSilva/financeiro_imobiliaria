package ada.financeiro.controller;

import ada.financeiro.payload.request.ClienteLocatarioRequest;
import ada.financeiro.service.CriarPagamentoLocatarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamento")
@RequiredArgsConstructor
public class PagamentoLocatarioController {
    private final CriarPagamentoLocatarioService criarPagamentoLocatarioService;

    @PostMapping(path = "/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public void pagarLocatario (@RequestBody ClienteLocatarioRequest clienteLocatarioRequest){
        criarPagamentoLocatarioService.pagar(clienteLocatarioRequest);
    }
}
