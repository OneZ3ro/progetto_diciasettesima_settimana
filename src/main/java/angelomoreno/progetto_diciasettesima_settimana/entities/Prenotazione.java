package angelomoreno.progetto_diciasettesima_settimana.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder(builderClassName = "PrenotazioneBuilder")
public class Prenotazione {
    @Id
    @GeneratedValue
    @Column(name = "prenotazione_id")
    private UUID idPrenotazione;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Postazione postazione;
    private LocalDate dataRiservazione;
    private LocalDate dataDiPrenotazione;

    public Prenotazione(Utente utente, Postazione postazione, LocalDate dataRiservazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.dataRiservazione = dataRiservazione;
        this.dataDiPrenotazione = LocalDate.now();
    }
}
