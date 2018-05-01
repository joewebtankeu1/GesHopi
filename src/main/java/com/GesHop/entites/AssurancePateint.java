package com.GesHop.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AssurancePateint implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  NumAssure;
	private Long NumSecurite;
	private String Numcontrat;
	private Long isAyantDroit;
	@ManyToOne
	@JoinColumn(name="NumCentralPatient")
	private String NomPrenomAssure; 
	private Date Datecreation;  
	private Pateint patient;
	private Long CodeTiers;

}
