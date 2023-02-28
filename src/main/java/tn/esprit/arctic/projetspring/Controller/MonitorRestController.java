package tn.esprit.arctic.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projetspring.Services.ImoniteurService;
import tn.esprit.arctic.projetspring.entities.Moniteur;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MonitorRestController {

    ImoniteurService moniteurService;

    // http://localhost:8089/stationSki/moniteur/retrieve-all-moniteurs
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        List<Moniteur> listMoniteurs = moniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }
    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable(" moniteur-id") Integer moniteurId) {
            return moniteurService.retrieveMoniteur(moniteurId);
}
    // http://localhost:8089/stationSki/moniteur/add-moniteur
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = moniteurService.addMoniteur(m);
        return moniteur;
    }
    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") Integer moniteurId) {
        moniteurService.deleteMoniteur(moniteurId);
    }

    // http://localhost:8089/stationSki/moniteur/update-moniteur
    @PutMapping("/update-moniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur= moniteurService.updateMoniteur(m);
        return moniteur;
    }
}
