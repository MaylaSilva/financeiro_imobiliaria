package ada.financeiro.service;

import ada.financeiro.entity.Locatario;
import ada.financeiro.repository.LocatarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CriarLocatarioService {
    private final LocatarioRepository locatarioRepository;
    public Locatario criar (Locatario locatario){
        return locatarioRepository.findByIdentificador(locatario.getIdentificador())
                .orElse(locatarioRepository.save(locatario));
    }
}
