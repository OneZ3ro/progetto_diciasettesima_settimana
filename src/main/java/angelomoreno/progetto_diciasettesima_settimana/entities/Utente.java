package angelomoreno.progetto_diciasettesima_settimana.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    public Utente(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
