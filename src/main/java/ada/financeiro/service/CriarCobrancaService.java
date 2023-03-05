package ada.financeiro.service;

import ada.financeiro.entity.Cobranca;
import ada.financeiro.entity.Locador;
import ada.financeiro.payload.request.ClienteLocadorRequest;
import ada.financeiro.repository.CobrancaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CriarCobrancaService {
    private final CriarLocadorService criarLocadorService;
    private final CobrancaRepository cobrancaRepository;
    public void cobrar(ClienteLocadorRequest clienteLocadorRequest){
        Locador locador = new Locador();
        Locador locadorSalvo = criarLocadorService.criar(locador);
        Cobranca cobranca = new Cobranca();
        cobranca.setLocador(locadorSalvo);
        cobranca.setValorAluguel(cobranca.getValorAluguel());
        cobrancaRepository.save(cobranca);
    }
}
