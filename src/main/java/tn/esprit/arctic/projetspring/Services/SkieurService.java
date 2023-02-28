package tn.esprit.arctic.projetspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.Repository.SkieurRepository;
import tn.esprit.arctic.projetspring.entities.Skieur;

import java.util.List;
@Service
@AllArgsConstructor
public class SkieurService implements IskieurService {
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {
         skieurRepository.findById(idSkieur).get();
        return null;
    }

    @Override
    public void deleteSkieur(Integer idSkieur) {
        skieurRepository.deleteById(idSkieur);
    }
}
