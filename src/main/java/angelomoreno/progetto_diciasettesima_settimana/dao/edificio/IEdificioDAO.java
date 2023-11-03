package angelomoreno.progetto_diciasettesima_settimana.dao.edificio;

import angelomoreno.progetto_diciasettesima_settimana.entities.Edificio;

public interface IEdificioDAO {
    public void save(Edificio edificio);

    public Edificio findById(long id);
}
