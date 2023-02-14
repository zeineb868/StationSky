package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Integer> {
}
