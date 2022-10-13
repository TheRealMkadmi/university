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
public class Universite {
    @Id
    @GeneratedValue
    private int idUniv;
    @Column
    private String nomUniv;


}
