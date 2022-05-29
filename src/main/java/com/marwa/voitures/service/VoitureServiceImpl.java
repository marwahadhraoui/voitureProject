package com.marwa.voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marwa.voitures.entities.Marque;
import com.marwa.voitures.entities.Modele;
import com.marwa.voitures.entities.Voiture;
import com.marwa.voitures.repos.VoitureRepository;
@Service
public class VoitureServiceImpl implements VoitureService {
	@Autowired
	VoitureRepository voitureRepository;

	@Override
	public Voiture saveVoiture(Voiture v) {
		return  voitureRepository.save(v);
		
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
	}

	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);		
	}

	@Override
	public Voiture getVoiture(Long id) {
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}

	@Override
	public List<Voiture> findByTypeVoiture(String typeVoiture) {
		return voitureRepository.findByTypeVoiture(typeVoiture);
	}

	@Override
	public List<Voiture> findByTypeVoitureContains(String typeVoiture) {
		return voitureRepository.findByTypeVoitureContains(typeVoiture);

	}

	@Override
	public List<Voiture> findByTypeVoiturePrixVoiture(String typeVoiture, Double prixVoiture) {
		return voitureRepository.findByTypeVoiturePrixVoiture(typeVoiture, prixVoiture);
	}

	@Override
	public List<Voiture> findByModele(Modele modele) {
	
		return voitureRepository.findByModele(modele);

	}

	@Override
	public List<Voiture> findByModeleIdMod(Long id) {

		return voitureRepository.findByModeleIdMod(id);
	}

	@Override
	public List<Voiture> findByOrderByTypeVoitureAsc() {
		return voitureRepository.findByOrderByTypeVoitureAsc();

	}

	@Override
	public List<Voiture> trierVoituresTypeVoituresPrixVoiture() {
		return voitureRepository.trierVoituresTypeVoituresPrixVoiture();
	}

	@Override
	public List<Voiture> findByMarque(Marque marque) {
		return voitureRepository.findByMarque(marque);

	}

	@Override
	public List<Voiture> findByMarqueIdMar(Long id) {
		return voitureRepository.findByMarqueIdMar(id);

	}

	

}
