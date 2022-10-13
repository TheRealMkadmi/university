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
public class Universite  implements Serializable, AbstractEntity<Universite> {
    @Id
    @GeneratedValue
    private Long idUniv;
    @Column
    private String nomUniv;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Universite that)) return false;
        return getIdUniv().equals(that.getIdUniv()) && getNomUniv().equals(that.getNomUniv());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUniv(), getNomUniv());
    }

    @Override
    public Long getId() {
        return this.idUniv;
    }

    @Override
    public void setId(Long id) {
        this.idUniv = id;
    }

    @Override
    public void update(Universite source) {
        this.nomUniv = source.nomUniv;
    }

    @Override
    public Universite create() {
        return Universite.builder().build();
    }
}
