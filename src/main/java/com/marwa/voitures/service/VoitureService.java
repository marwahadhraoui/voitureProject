package com.marwa.voitures.service;

import java.util.List;

import com.marwa.voitures.entities.Marque;
import com.marwa.voitures.entities.Modele;
import com.marwa.voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	
	List<Voiture> findByTypeVoiture(String typeVoiture);
	List<Voiture> findByTypeVoitureContains(String typeVoiture);
	List<Voiture> findByTypeVoiturePrixVoiture(String typeVoiture, Double prixVoiture);
	List<Voiture> findByModele (Modele modele);
	List<Voiture> findByMarque (Marque marque);
	
	List<Voiture> findByModeleIdMod(Long id);
	List<Voiture> findByMarqueIdMar(Long id);
	
	List<Voiture> findByOrderByTypeVoitureAsc();
	List<Voiture> trierVoituresTypeVoituresPrixVoiture();
}
