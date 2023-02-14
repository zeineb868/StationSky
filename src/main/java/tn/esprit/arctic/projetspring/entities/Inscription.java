package tn.esprit.arctic.projetspring.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idInscription")
    private Integer idInscription;
    private Long numInscription;
    private Integer numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
