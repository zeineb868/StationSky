package tn.esprit.arctic.projetspring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idAbonnement")
    private Integer idAbonnement;
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbon typeAbon;

}
