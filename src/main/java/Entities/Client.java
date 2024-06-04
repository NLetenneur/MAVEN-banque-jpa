package Entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	@OneToOne
	@JoinColumn(name="ID_Ad")
	protected Adresse adresse;
	
	@ManyToMany
	@JoinTable(name="cliComptes",
	joinColumns= @JoinColumn(name="ID_Compte", referencedColumnName="id"),
	inverseJoinColumns= @JoinColumn(name="ID_Cli", referencedColumnName="id")
	)
	private Set<Compte> comptes;

	/** Constructor
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param comptes
	 */
	public Client(String nom, String prenom, Date dateNaissance, Adresse adresse, Set<Compte> comptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.comptes = comptes;
	}

	/** Constructor
	 * 
	 */
	public Client() {
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", comptes=" + comptes + "]";
	}

	/** Getter pour id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**Setter pour id
	 * @param id id 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour nom
	 * @param nom nom 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter pour prenom
	 * @param prenom prenom 
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour dateNaissance
	 * @return dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**Setter pour dateNaissance
	 * @param dateNaissance dateNaissance 
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter pour adresse
	 * @return adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**Setter pour adresse
	 * @param adresse adresse 
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/** Getter pour comptes
	 * @return comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**Setter pour comptes
	 * @param comptes comptes 
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	

}
