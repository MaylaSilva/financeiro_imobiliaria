package ada.financeiro.service;

import ada.financeiro.entity.Locador;
import ada.financeiro.repository.LocadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CriarLocadorService {
    private final LocadorRepository locadorRepository;
    public Locador criar (Locador locador){
        return locadorRepository.findByIdentificador(locador.getIdentificador())
                .orElse(locadorRepository.save(locador));
    }
}
