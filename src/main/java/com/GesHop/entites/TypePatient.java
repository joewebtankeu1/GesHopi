package com.GesHop.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TypePatient implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String CodeTypePatient;
	private String LibellePatient;
	
	public TypePatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TypePatient(String codetypePatient) {
		super();
		CodeTypePatient = codetypePatient;
	}
	
	public String getCodetypePatient() {
		return CodeTypePatient;
	}
	public void setCodetypePatient(String codetypePatient) {
		CodeTypePatient = codetypePatient;
	}
	public String getLibellePatient() {
		return LibellePatient;
	}
	public void setLibellePatient(String libellePatient) {
		LibellePatient = libellePatient;
	}

}
