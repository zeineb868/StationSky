package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.MoniteurRepository;
import tn.esprit.arctic.projetspring.entities.Moniteur;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurService implements ImoniteurService {
    MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();

    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return moniteurRepository.save(e);

    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return moniteurRepository.save(e);

    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        moniteurRepository.findById(idMoniteur).get();
        return null;
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);

    }
}
