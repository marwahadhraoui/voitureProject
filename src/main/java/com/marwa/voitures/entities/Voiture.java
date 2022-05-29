package com.marwa.voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;

	private Double prixVoiture;
	private String typeVoiture;
	private Date dateCreation;
	@ManyToOne
	private Modele modele;

	@ManyToOne
	private Marque marque;

	public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(Double prixVoiture, String typeVoiture, Date dateCreation, Modele modele) {
		super();
		this.prixVoiture = prixVoiture;
		this.typeVoiture = typeVoiture;
		this.dateCreation = dateCreation;
		this.modele = modele;
	}

	public String getTypeVoiture() {
		return typeVoiture;
	}

	public void setTypeVoiture(String typeVoiture) {
		this.typeVoiture = typeVoiture;
	}

	public Long getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	public Double getPrixVoiture() {
		return prixVoiture;
	}

	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", prixVoiture=" + prixVoiture + ", typeVoiture=" + typeVoiture
				+ ", dateCreation=" + dateCreation + ", modele=" + modele + "]";
	}

}
