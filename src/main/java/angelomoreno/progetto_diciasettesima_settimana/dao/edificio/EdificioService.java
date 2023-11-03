package angelomoreno.progetto_diciasettesima_settimana.dao.edificio;

import angelomoreno.progetto_diciasettesima_settimana.entities.Edificio;
import angelomoreno.progetto_diciasettesima_settimana.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService implements IEdificioDAO {
    @Autowired
    private EdificioRepository edificioRepo;

    @Override
    public void save(Edificio edificio) {
        edificioRepo.save(edificio);
        log.info("*************** EDIFICIO SALVATO CON SUCCESSO ***************");
    }

    @Override
    public Edificio findById(long id) {
        return edificioRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }
}
