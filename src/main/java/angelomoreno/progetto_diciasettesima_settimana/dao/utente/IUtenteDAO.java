package angelomoreno.progetto_diciasettesima_settimana.dao.utente;

import angelomoreno.progetto_diciasettesima_settimana.entities.Utente;
import angelomoreno.progetto_diciasettesima_settimana.enums.TipoPostazione;

public interface IUtenteDAO {
    public void save(Utente utente);

    public void findById(long id);

    public void prenotaPostazione();

    public void cercaPostazionePerId(long id);

    public void cercaPostazionePerTipoECitta(TipoPostazione tipoPostazione, String citta);
}
