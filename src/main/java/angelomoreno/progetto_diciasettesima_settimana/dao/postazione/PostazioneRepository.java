package angelomoreno.progetto_diciasettesima_settimana.dao.postazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
}
