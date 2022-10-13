package edu.esprit.university.entities;

import edu.esprit.university.lib.AbstractEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Etudiant  implements Serializable, AbstractEntity<Etudiant> {
    @Override
    public Etudiant create() {
        return null;
    }
    public enum Option {
        GAMIX,
        SE,
        SIM,
        NIDS
    }
    @Id
    @GeneratedValue
    private Long idEtudiant;
    @Column
    private String prenomE;
    @Column
    private String nomE;
    @Column
    private Option optionE;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant etudiant)) return false;
        return getIdEtudiant().equals(etudiant.getIdEtudiant()) && getPrenomE().equals(etudiant.getPrenomE()) && getNomE().equals(etudiant.getNomE()) && getOptionE() == etudiant.getOptionE();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEtudiant(), getPrenomE(), getNomE(), getOptionE());
    }

    @Override
    public Long getId() {
        return this.idEtudiant;
    }

    @Override
    public void setId(Long id) {
        this.idEtudiant = id;
    }

    @Override
    public void update(Etudiant source) {
        this.prenomE = source.prenomE;
        this.nomE = source.nomE;
        this.optionE = source.optionE;
    }
}
