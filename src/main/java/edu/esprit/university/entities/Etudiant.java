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
public class Etudiant {
    public enum option {
        GAMIX,
        SE,
        SIM,
        NIDS;
    }

    @Id
    @GeneratedValue
    private int idEtudiant;
    @Column
    private String prenomE;
    @Column
    private String nomE;
    @Column
    private option option;


}
