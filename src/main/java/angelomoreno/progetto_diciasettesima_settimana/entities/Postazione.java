package angelomoreno.progetto_diciasettesima_settimana.entities;

import angelomoreno.progetto_diciasettesima_settimana.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
//@Builder(builderClassName = "PostazioneBuilder")
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
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, long maxOccupanti, long occupantiCorrente, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxOccupanti = maxOccupanti;
        this.occupantiCorrente = occupantiCorrente;
        this.edificio = edificio;
    }
}
