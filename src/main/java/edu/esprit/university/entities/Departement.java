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
public class Departement {
    @Id
    @GeneratedValue
    private int idDepart;
    @Column
    private String nomDepart;
}


