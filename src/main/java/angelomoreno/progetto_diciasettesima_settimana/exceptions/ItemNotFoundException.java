package angelomoreno.progetto_diciasettesima_settimana.exceptions;

import java.util.UUID;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(long id) {
        super("Non è stato trovato nulla con id: " + id + ". Riprova");
    }

    public ItemNotFoundException(UUID id) {
        super("Non è stato trovato nulla con id: " + id + ". Riprova");
    }
}
