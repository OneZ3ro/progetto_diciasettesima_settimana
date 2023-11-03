package angelomoreno.progetto_diciasettesima_settimana;

import angelomoreno.progetto_diciasettesima_settimana.dao.IUtenteDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UtenteRunner implements CommandLineRunner {
    @Autowired
    private IUtenteDAO utenteDAO;

    @Override
    public void run(String... args) throws Exception {

    }
}
