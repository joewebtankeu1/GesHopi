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
	
	private String Code_typePatient;
	private String LibellePatient;
	
	public TypePatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TypePatient(String code_typePatient) {
		super();
		Code_typePatient = code_typePatient;
	}
	
	public String getCode_typePatient() {
		return Code_typePatient;
	}
	public void setCode_typePatient(String code_typePatient) {
		Code_typePatient = code_typePatient;
	}
	public String getLibellePatient() {
		return LibellePatient;
	}
	public void setLibellePatient(String libellePatient) {
		LibellePatient = libellePatient;
	}

}
