package angelomoreno.progetto_diciasettesima_settimana.dao.edificio;

import angelomoreno.progetto_diciasettesima_settimana.entities.Edificio;
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

    }

    @Override
    public void findById(long id) {

    }
}
