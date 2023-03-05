package ada.financeiro.controller;

import ada.financeiro.payload.request.ClienteLocadorRequest;
import ada.financeiro.service.CriarCobrancaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cobranca")
@RequiredArgsConstructor
public class CobrancaController {

    private final CriarCobrancaService criarCobrancaService;
    @PostMapping(path = "/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public void cobrarClienteLocador (@RequestBody ClienteLocadorRequest clienteLocadorRequest){
        criarCobrancaService.cobrar(clienteLocadorRequest);
    }
}
