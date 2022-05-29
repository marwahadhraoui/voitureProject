package com.marwa.voitures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.marwa.voitures.entities.Marque;
import com.marwa.voitures.entities.Modele;
import com.marwa.voitures.entities.Voiture;
@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	List <Voiture> findByTypeVoiture(String typeVoiture);
	List <Voiture> findByTypeVoitureContains(String typeVoiture);

	
	@Query("select v from Voiture v where v.typeVoiture like %:typeVoiture and v.prixVoiture > :prixVoiture")
	List<Voiture> findByTypeVoiturePrixVoiture (@Param("typeVoiture") String typeVoiture,@Param("prixVoiture") Double prixVoiture);
	
	@Query("select v from Voiture v where v.modele = ?1")
	List<Voiture> findByModele (Modele modele);
	
	@Query("select v from Voiture v where v.marque = ?1")
	List<Voiture> findByMarque (Marque marque);
	
	List<Voiture> findByModeleIdMod(Long id);

	List<Voiture> findByOrderByTypeVoitureAsc();
	
	@Query("select v from Voiture v order by v.typeVoiture ASC, v.prixVoiture DESC")
	List<Voiture> trierVoituresTypeVoituresPrixVoiture ();
	

	
	List<Voiture> findByMarqueIdMar(Long id);

}

