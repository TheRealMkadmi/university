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
@Builder
@ToString
public class Equipe implements Serializable, AbstractEntity<Equipe> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipe equipe)) return false;
        return getIdEquipe().equals(equipe.getIdEquipe()) && getNomEquipe().equals(equipe.getNomEquipe()) && getNiveau() == equipe.getNiveau();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEquipe(), getNomEquipe(), getNiveau());
    }

    @Override
    public Long getId() {
        return this.idEquipe;
    }

    @Override
    public void setId(Long id) {
        this.idEquipe = id;
    }

    @Override
    public void update(Equipe source) {
        this.nomEquipe = source.nomEquipe;
        this.niveau = source.niveau;
    }

    @Override
    public Equipe create() {
        return Equipe.builder().build();
    }

    public enum niveau {
        JUNIOR,
        SENIOR,
        EXPERT
    }


    @GeneratedValue
    @Id
    private Long idEquipe;
    @Column
    private String nomEquipe;
    @Column
    private niveau niveau;


}
