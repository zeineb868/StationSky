package tn.esprit.arctic.projetspring.Services;

import tn.esprit.arctic.projetspring.entities.Moniteur;

import java.util.List;

public interface ImoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Integer idMoniteur);

    void deleteMoniteur( Integer idMoniteur);
}
