package tn.esprit.arctic.projetspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Cours;

public interface CoursRepositroy extends JpaRepository<Cours,Integer> {
}
