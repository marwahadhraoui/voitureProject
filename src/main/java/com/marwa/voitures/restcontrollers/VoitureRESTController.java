package com.marwa.voitures.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marwa.voitures.entities.Voiture;
import com.marwa.voitures.service.VoitureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoitureRESTController {
	@Autowired
	VoitureService voitureService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Voiture> getAllProduits() {
		return voitureService.getAllVoitures();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Voiture getVoitureById(@PathVariable("id") Long id) {
	return voitureService.getVoiture(id);

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Voiture createVoiture(@RequestBody Voiture voiture) {
	return voitureService.saveVoiture(voiture);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Voiture updateVoiture(@RequestBody Voiture voiture) {
	return voitureService.updateVoiture(voiture);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") Long id)
	{
		voitureService.deleteVoitureById(id);
	}
	
	@RequestMapping(value="/voituresMod/{idMod}",method = RequestMethod.GET)
	public List<Voiture> getVoituresByModId(@PathVariable("idMod") Long idMod) {
	return voitureService.findByModeleIdMod(idMod);
	}
	

	@RequestMapping(value="/voituresMar/{idMar}",method = RequestMethod.GET)
	public List<Voiture> getVoituresByMarId(@PathVariable("idMar") Long idMar) {
	return voitureService.findByMarqueIdMar(idMar);
	}
	
	@RequestMapping(value="/voitsByType/{typeVoiture}",method = RequestMethod.GET)
	public List<Voiture> findByTypeVoitureContains(@PathVariable("typeVoiture") String typeVoiture) {
	return voitureService.findByTypeVoitureContains(typeVoiture);
	}
}
