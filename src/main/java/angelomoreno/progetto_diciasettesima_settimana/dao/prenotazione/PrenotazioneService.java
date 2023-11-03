package angelomoreno.progetto_diciasettesima_settimana.dao.prenotazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PrenotazioneService implements IPrenotazioneDAO {
    @Autowired
    private PrenotazioneRepository prenotazioneRepo;

    @Override
    public void save(Prenotazione prenotazione) {

    }

    @Override
    public void findById(UUID id) {

    }
}
