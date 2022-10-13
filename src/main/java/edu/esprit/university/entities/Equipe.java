package tn.esprit.miniprojet.springboot.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Equipe {
    public enum niveau {
        JUNIOR,
        SENIOR,
        EXPERT;
    }


    @GeneratedValue
    @Id
    private int idEquipe;
    @Column
    private String nomEquipe;
    @Column
    private niveau niveau;


}
