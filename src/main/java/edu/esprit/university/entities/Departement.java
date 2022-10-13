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
@Builder
public class Departement implements Serializable, AbstractEntity<Departement> {
    @Id
    @GeneratedValue
    private Long idDepart;
    @Column
    private String nomDepart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getIdDepart().equals(that.getIdDepart()) && getNomDepart().equals(that.getNomDepart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDepart(), getNomDepart());
    }

    @Override
    public Long getId() {
        return this.idDepart;
    }

    @Override
    public void setId(Long id) {
        this.idDepart = id;
    }

    @Override
    public void update(Departement source) {
        this.nomDepart = source.nomDepart;
    }

    @Override
    public Departement create() {
        return Departement.builder().build();
    }
}


