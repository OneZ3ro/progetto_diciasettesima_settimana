package angelomoreno.progetto_diciasettesima_settimana.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Locale;
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
    @JoinColumn(nullable = false)
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "postazione", nullable = false)
    private Postazione postazione;
    private LocalDate dataRiservazione;
    private LocalDate dataDiPrenotazione;

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public void setDataRiservazione(LocalDate dataRiservazione) {
        this.dataRiservazione = dataRiservazione;
    }

    public static class PrenotazioneBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private LocalDate dataDiPrenotazione = LocalDate.now();
    }
}
