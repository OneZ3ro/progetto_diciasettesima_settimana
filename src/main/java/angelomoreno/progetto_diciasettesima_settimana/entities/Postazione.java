package angelomoreno.progetto_diciasettesima_settimana.entities;

import angelomoreno.progetto_diciasettesima_settimana.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

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
    @ManyToOne
    private Edificio edificio;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, long maxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxOccupanti = maxOccupanti;
        this.edificio = edificio;
    }
}
