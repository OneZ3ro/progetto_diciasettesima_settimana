package angelomoreno.progetto_diciasettesima_settimana.dao;

import angelomoreno.progetto_diciasettesima_settimana.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
