package com.GesHop.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AssurancePateint implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  NumAssure;
	private Long NumSecurite;
	private String Numcontrat;
	private Long isAyantDroit;
	private String NomPrenomAssure; 
	private Date Datecreation;  
	private Long NumCentralPatient;
	private Long CodeTiers;

}
