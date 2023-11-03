package angelomoreno.progetto_diciasettesima_settimana.dao.prenotazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
}
