package angelomoreno.progetto_diciasettesima_settimana.dao.edificio;

import angelomoreno.progetto_diciasettesima_settimana.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
