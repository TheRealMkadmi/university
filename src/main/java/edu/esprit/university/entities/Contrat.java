package tn.esprit.miniprojet.springboot.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Contrat {
    public enum specialite {
        IA,
        RESEAUX,
        CLOUD,
        SECURITE;
    }

    @Id
    @GeneratedValue
    private int idContrat;
    @Column
    private Date dateDebutContrat;
    @Column
    private Date dateFinContrat;
    @Column
    private specialite specialite;
    @Column
    private Boolean archive;


}
