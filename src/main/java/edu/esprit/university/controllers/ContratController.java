package edu.esprit.university.controllers;

import edu.esprit.university.entities.Contrat;
import edu.esprit.university.lib.AbstractController;
import edu.esprit.university.lib.AbstractRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contrats")
public class ContratController extends AbstractController<Contrat> {
    public ContratController(AbstractRepository<Contrat> repository) {
        super(repository);
    }
}
