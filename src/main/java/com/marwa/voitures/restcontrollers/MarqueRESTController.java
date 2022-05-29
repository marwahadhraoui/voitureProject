package com.marwa.voitures.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marwa.voitures.entities.Marque;
import com.marwa.voitures.repos.MarqueRepository;

@RestController
@RequestMapping("/api/mar")
@CrossOrigin("*")
public class MarqueRESTController {
@Autowired
MarqueRepository marqueRepository;
@RequestMapping(method=RequestMethod.GET)
public List<Marque> getAllMarques()
{
return marqueRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Marque getMarqueById(@PathVariable("id") Long id) {
return marqueRepository.findById(id).get();
}
}

