package eu.school.demospring.entities;

import jakarta.persistence.*;

@Entity
public class Personne {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String prenom;
	private String nom;
	private String email;
	private String dateNaiss;
	private String tel;

	public Personne() {
	}

	public Personne(String prenom, String nom, String email, String dateNaiss, String tel) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.dateNaiss = dateNaiss;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Personne{" +
				"id=" + id +
				", prenom='" + prenom + '\'' +
				", nom='" + nom + '\'' +
				", email='" + email + '\'' +
				", dateNaiss='" + dateNaiss + '\'' +
				", tel='" + tel + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
