package com.marwa.voitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Modele {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMod;
	private String nomMod;
	private String descriptionMod;
	@JsonIgnore
	@OneToMany(mappedBy="modele")
	private List<Voiture> voitures;
	
	
	public List<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Long getIdMod() {
		return idMod;
	}
	public void setIdMod(Long idMod) {
		this.idMod = idMod;
	}
	public String getNomMod() {
		return nomMod;
	}
	public void setNomMod(String nomMod) {
		this.nomMod = nomMod;
	}
	public String getDescriptionMod() {
		return descriptionMod;
	}
	public void setDescriptionMod(String descriptionMod) {
		this.descriptionMod = descriptionMod;
	}
	

}
