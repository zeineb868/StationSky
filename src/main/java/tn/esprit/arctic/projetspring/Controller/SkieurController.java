package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.IskieurService;
import tn.esprit.arctic.projetspring.Services.SkieurService;
import tn.esprit.arctic.projetspring.entities.Moniteur;
import tn.esprit.arctic.projetspring.entities.Skieur;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    IskieurService iskieurService;
    @GetMapping("/retrieve-all-Skieur")
    public List<Skieur> getSkieurs() {
        List<Skieur> listSkieurs = iskieurService.retrieveAllSkieurs();
        return listSkieurs;
    }
    @GetMapping("/retrieve-Skieur/{Skieur-id}")
    public Skieur retrieveSkieur(@PathVariable(" Skieur-id") Integer SkieurId) {
        return iskieurService.retrieveSkieur(SkieurId);
    }
    @PostMapping("/add-Skieur")
    public Skieur addSkieur(@RequestBody Skieur m) {
        Skieur skieur = iskieurService.addSkieur(m);
        return skieur;
    }
    @DeleteMapping("/remove-Skieur/{Skieur-id}")
    public void removeSkieur(@PathVariable("Skieur-id") Integer SkieurId) {
        iskieurService.deleteSkieur(SkieurId);
    }

    // http://localhost:8089/stationSki/moniteur/update-moniteur
    @PutMapping("/update-mSkieur")
    public Skieur updateSkieur(@RequestBody Skieur m) {
        Skieur skieur= iskieurService.updateSkieur(m);
        return skieur;
    }
}
