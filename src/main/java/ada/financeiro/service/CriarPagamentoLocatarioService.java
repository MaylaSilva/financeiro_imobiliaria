package ada.financeiro.service;

import ada.financeiro.entity.Locatario;
import ada.financeiro.entity.PagamentoLocatario;
import ada.financeiro.payload.request.ClienteLocatarioRequest;
import ada.financeiro.repository.PagamentoLocatarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CriarPagamentoLocatarioService {
    private final CriarLocatarioService criarLocatarioService;
    private final PagamentoLocatarioRepository pagamentoLocatarioRepository;
    public void pagar(ClienteLocatarioRequest clienteLocatarioRequest){
        Locatario locatario = new Locatario();
        Locatario locatarioSalvo = criarLocatarioService.criar(locatario);
        PagamentoLocatario pagamento = new PagamentoLocatario();
        pagamento.setLocatario(locatarioSalvo);
        pagamento.setValorRepasse(pagamento.getValorRepasse());
        pagamentoLocatarioRepository.save(pagamento);
    }
}
