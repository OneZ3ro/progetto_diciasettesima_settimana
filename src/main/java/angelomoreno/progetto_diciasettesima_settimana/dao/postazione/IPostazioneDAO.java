package angelomoreno.progetto_diciasettesima_settimana.dao.postazione;

import angelomoreno.progetto_diciasettesima_settimana.entities.Postazione;

public interface IPostazioneDAO {
    public void save(Postazione postazione);

    public Postazione findById(long id);

}
