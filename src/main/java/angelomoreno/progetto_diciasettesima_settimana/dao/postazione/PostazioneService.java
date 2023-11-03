package angelomoreno.progetto_diciasettesima_settimana.dao.postazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Postazione;
import angelomoreno.progetto_diciasettesima_settimana.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService implements IPostazioneDAO {
    @Autowired
    private PostazioneRepository postazioneRepo;

    @Override
    public void save(Postazione postazione) {
        postazioneRepo.save(postazione);
        log.info("*************** POSTAZIONE SALVATA CON SUCCESSO ***************");
    }

    @Override
    public Postazione findById(long id) {
        return postazioneRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }
}
