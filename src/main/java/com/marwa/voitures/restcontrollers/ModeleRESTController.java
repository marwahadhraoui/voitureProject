package com.marwa.voitures.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marwa.voitures.entities.Marque;
import com.marwa.voitures.entities.Modele;
import com.marwa.voitures.repos.MarqueRepository;
import com.marwa.voitures.repos.ModeleRepository;

@RestController
@RequestMapping("/api/mod")
@CrossOrigin("*")
public class ModeleRESTController {
@Autowired
ModeleRepository modeleRepository;
@RequestMapping(method=RequestMethod.GET)
public List<Modele> getAllModeles()
{
return modeleRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Modele getModeleById(@PathVariable("id") Long id) {
return modeleRepository.findById(id).get();
}
}