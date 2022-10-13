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
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class DetailEquipe  implements Serializable, AbstractEntity<DetailEquipe> {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Long salle;
    @Column
    private String thematique;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailEquipe that)) return false;
        return getId().equals(that.getId()) && getSalle().equals(that.getSalle()) && getThematique().equals(that.getThematique());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSalle(), getThematique());
    }

    @Override
    public void update(DetailEquipe source) {
        this.salle = source.salle;
        this.thematique = source.thematique;
    }

    @Override
    public DetailEquipe create() {
        return DetailEquipe.builder().build();
    }
}
