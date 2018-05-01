package com.GesHop.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdGroupe;
	private String LibellePatient;
	private String DateCreationGroupe;
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groupe(Long idGroupe) {
		super();
		IdGroupe = idGroupe;
	}
	public Long getIdGroupe() {
		return IdGroupe;
	}
	public void setIdGroupe(Long idGroupe) {
		IdGroupe = idGroupe;
	}
	public String getLibellePatient() {
		return LibellePatient;
	}
	public void setLibellePatient(String libellePatient) {
		LibellePatient = libellePatient;
	}
	public String getDateCreationGroupe() {
		return DateCreationGroupe;
	}
	public void setDateCreationGroupe(String dateCreationGroupe) {
		DateCreationGroupe = dateCreationGroupe;
	}

}
