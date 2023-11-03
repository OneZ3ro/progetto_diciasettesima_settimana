package angelomoreno.progetto_diciasettesima_settimana.entities;

import jakarta.persistence.*;
import lombok.*;

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
}
