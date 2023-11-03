package angelomoreno.progetto_diciasettesima_settimana.dao.prenotazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Prenotazione;

import java.util.UUID;

public interface IPrenotazioneDAO {
    public void save(Prenotazione prenotazione);

    public Prenotazione findById(UUID id);
}
