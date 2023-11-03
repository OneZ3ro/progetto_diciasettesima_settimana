package angelomoreno.progetto_diciasettesima_settimana.entities;

import angelomoreno.progetto_diciasettesima_settimana.enums.TipoPostazione;
import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder(builderClassName = "PostazioneBuilder")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postazione_id")
    private long idPostazione;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    @Column(name = "max_occupanti")
    private long maxOccupanti;
    @Column(name = "occupanti_corrente")
    private long occupantiCorrente;
    @ManyToOne
    @JoinColumn(name = "edificio", nullable = false)
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setMaxOccupanti(long maxOccupanti) {
        this.maxOccupanti = maxOccupanti;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public static class PostazioneBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private String descrizione = faker.superhero().descriptor();
        private long occupantiCorrente = 0;
    }
}
