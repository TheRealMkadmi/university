package edu.esprit.university.entities;

import edu.esprit.university.lib.AbstractEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Contrat implements Serializable, AbstractEntity<Contrat> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Column
    private Date dateDebutContrat;
    @Column
    private Date dateFinContrat;
    @Column
    private Specialite specialite;
    @Column
    private Boolean archive;
    
    public enum Specialite {
        IA,
        RESEAUX,
        CLOUD,
        SECURITE
    }
    
    @Override
    public Long getId() {
        return this.idContrat;
    }

    @Override
    public void setId(Long id) {
        this.idContrat = id;
    }

    @Override
    public void update(Contrat source) {
        this.dateDebutContrat = source.dateDebutContrat;
        this.dateFinContrat = source.dateFinContrat;
        this.specialite = source.specialite;
        this.archive = source.archive;
    }

    @Override
    public Contrat create() {
        return Contrat.builder().build();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contrat contrat)) return false;
        return getIdContrat().equals(contrat.getIdContrat()) && getDateDebutContrat().equals(contrat.getDateDebutContrat()) && getDateFinContrat().equals(contrat.getDateFinContrat()) && getSpecialite() == contrat.getSpecialite() && getArchive().equals(contrat.getArchive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdContrat(), getDateDebutContrat(), getDateFinContrat(), getSpecialite(), getArchive());
    }


}
