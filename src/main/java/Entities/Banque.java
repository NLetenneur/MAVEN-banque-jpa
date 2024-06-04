package Entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	@OneToMany(mappedBy = "banque")
	protected Set<Compte> comptes;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param comptes
	 */
	public Banque(String nom, Set<Compte> comptes) {
		this.nom = nom;
		this.comptes = comptes;
	}

	/**
	 * Constructor jpa
	 * 
	 */
	public Banque() {
		super();
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + "]";
	}

	/**
	 * Getter pour id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour id
	 * 
	 * @param id id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour nom
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour comptes
	 * 
	 * @return comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter pour comptes
	 * 
	 * @param comptes comptes
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
}
