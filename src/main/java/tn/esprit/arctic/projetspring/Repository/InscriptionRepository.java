package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Integer> {
}
