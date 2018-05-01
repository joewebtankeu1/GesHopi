package com.GesHop.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Pateint implements Serializable {
	
	@Id
	private String NumCentralPatient; 
	private String NomPateint; 
	private String PrenomPatient;
	private Date DateNaisPatient;
	private String  LieuNaisPatient;
	private Long SexePatient;
	@ManyToOne
	@JoinColumn(name="CodeCivilite")
	private Civilite civilite;
	private String EmprunteDigid;
	private String SigneBiometrie;
	private Date DatesCreationPatient;
	private String CommantairePatient;
	private String NomPrenomPatient;
	private String NomPatientMask;
	private String CodeBarrePatient; 
	@ManyToOne
	@JoinColumn(name="CodeTypePatient")
	private TypePatient typePatient; 
	
	@ManyToOne
	@JoinColumn(name="CodeProfession")
	private Profession profession;
	private Long IsInfoACompleter;
	private String Adresse;
	private String Telephone;
	private String Fax;
	private String Email;
	private String Pays;
	private String Region;
	private String Ville;
	private String Quartier;
	
	public Pateint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pateint(String numCentralPatient, String nomPateint, String prenomPatient, Date dateNaisPatient,
			String lieuNaisPatient, Long sexePatient, Civilite civilite, String nomPrenomPatient,
			TypePatient typePatient, String telephone) {
		super();
		NumCentralPatient = numCentralPatient;
		NomPateint = nomPateint;
		PrenomPatient = prenomPatient;
		DateNaisPatient = dateNaisPatient;
		LieuNaisPatient = lieuNaisPatient;
		SexePatient = sexePatient;
		this.civilite = civilite;
		NomPrenomPatient = nomPrenomPatient;
		this.typePatient = typePatient;
		Telephone = telephone;
	}

	public String getNumCentralPatient() {
		return NumCentralPatient;
	}

	public void setNumCentralPatient(String numCentralPatient) {
		NumCentralPatient = numCentralPatient;
	}

	public String getNomPateint() {
		return NomPateint;
	}

	public void setNomPateint(String nomPateint) {
		NomPateint = nomPateint;
	}

	public String getPrenomPatient() {
		return PrenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		PrenomPatient = prenomPatient;
	}

	public Date getDateNaisPatient() {
		return DateNaisPatient;
	}

	public void setDateNaisPatient(Date dateNaisPatient) {
		DateNaisPatient = dateNaisPatient;
	}

	public String getLieuNaisPatient() {
		return LieuNaisPatient;
	}

	public void setLieuNaisPatient(String lieuNaisPatient) {
		LieuNaisPatient = lieuNaisPatient;
	}

	public Long getSexePatient() {
		return SexePatient;
	}

	public void setSexePatient(Long sexePatient) {
		SexePatient = sexePatient;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getEmprunteDigid() {
		return EmprunteDigid;
	}

	public void setEmprunteDigid(String emprunteDigid) {
		EmprunteDigid = emprunteDigid;
	}

	public String getSigneBiometrie() {
		return SigneBiometrie;
	}

	public void setSigneBiometrie(String signeBiometrie) {
		SigneBiometrie = signeBiometrie;
	}

	public Date getDatesCreationPatient() {
		return DatesCreationPatient;
	}

	public void setDatesCreationPatient(Date datesCreationPatient) {
		DatesCreationPatient = datesCreationPatient;
	}

	public String getCommantairePatient() {
		return CommantairePatient;
	}

	public void setCommantairePatient(String commantairePatient) {
		CommantairePatient = commantairePatient;
	}

	public String getNomPrenomPatient() {
		return NomPrenomPatient;
	}

	public void setNomPrenomPatient(String nomPrenomPatient) {
		NomPrenomPatient = nomPrenomPatient;
	}

	public String getNomPatientMask() {
		return NomPatientMask;
	}

	public void setNomPatientMask(String nomPatientMask) {
		NomPatientMask = nomPatientMask;
	}

	public String getCodeBarrePatient() {
		return CodeBarrePatient;
	}

	public void setCodeBarrePatient(String codeBarrePatient) {
		CodeBarrePatient = codeBarrePatient;
	}

	public TypePatient getTypePatient() {
		return typePatient;
	}

	public void setTypePatient(TypePatient typePatient) {
		this.typePatient = typePatient;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Long getIsInfoACompleter() {
		return IsInfoACompleter;
	}

	public void setIsInfoACompleter(Long isInfoACompleter) {
		IsInfoACompleter = isInfoACompleter;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getQuartier() {
		return Quartier;
	}

	public void setQuartier(String quartier) {
		Quartier = quartier;
	}

}
