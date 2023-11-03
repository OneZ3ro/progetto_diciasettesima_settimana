package angelomoreno.progetto_diciasettesima_settimana.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder(builderClassName = "EdificioBuilder")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edificio_id")
    private long idEdificio;
    private String nome;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    public static class EdificioBuilder {
        private Faker faker = new Faker(Locale.ITALY);
        private String nome = faker.gameOfThrones().dragon();
        private String indirizzo = faker.address().fullAddress();
        private String citta = faker.address().cityName();
    }
}
