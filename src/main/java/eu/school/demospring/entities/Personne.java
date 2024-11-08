package eu.school.demospring.entities;

import jakarta.persistence.*;

@Entity
public class Personne {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String prenom;
	private String nom;
	private String email;

	public Personne() {
	}

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne{" +
				"id=" + id +
				", prenom='" + prenom + '\'' +
				", nom='" + nom + '\'' +
				", email='" + email + '\'' +
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

}
