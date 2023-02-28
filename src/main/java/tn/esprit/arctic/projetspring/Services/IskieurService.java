package tn.esprit.arctic.projetspring.Services;

import tn.esprit.arctic.projetspring.entities.Skieur;

import java.util.List;

public interface IskieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur s);

    Skieur updateSkieur (Skieur s);

    Skieur retrieveSkieur (Integer idSkieur);

    void deleteSkieur( Integer idSkieur);
}
