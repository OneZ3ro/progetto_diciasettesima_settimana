package angelomoreno.progetto_diciasettesima_settimana.dao.utente;

import angelomoreno.progetto_diciasettesima_settimana.entities.Utente;
import angelomoreno.progetto_diciasettesima_settimana.enums.TipoPostazione;
import angelomoreno.progetto_diciasettesima_settimana.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService implements IUtenteDAO {
    @Autowired
    private UtenteRepository utenteRepo;

    @Override
    public void save(Utente utente) {
        utenteRepo.save(utente);
        log.info("*************** UTENTE SALVATO CON SUCCESSO ***************");
    }

    @Override
    public Utente findById(long id) {
        return utenteRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public void prenotaPostazione() {
        
    }

    @Override
    public void cercaPostazionePerId(long id) {

    }

    @Override
    public void cercaPostazionePerTipoECitta(TipoPostazione tipoPostazione, String citta) {

    }
}
