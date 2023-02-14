package tn.esprit.arctic.projetspring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column( name = "idCours")
    private Integer idCours;
    private long nomCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    private Integer creneau;
    @OneToMany ( mappedBy = "cours")
    private Set<Inscription> inscriptions;
}
