package angelomoreno.progetto_diciasettesima_settimana.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder(builderClassName = "UtenteBuilder")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utente_id")
    private long idUtente;
    private String username;
    private String nome;
    private String cognome;
    private String email;
    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;

    public static class UtenteBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private String username = faker.name().username();
        private String nome = faker.name().firstName();
        private String cognome = faker.name().lastName();
        private String email = faker.internet().emailAddress();
    }
}
