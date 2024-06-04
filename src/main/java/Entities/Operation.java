package Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="operation")
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected LocalDateTime date;
	protected double montant;
	protected String motif;
	@ManyToOne
	@JoinColumn(name = "ID_Compte")
	private Compte compte;
	/** Constructor
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 */
	public Operation(int id, LocalDateTime date, double montant, String motif, Compte compte) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte = compte;
	}
	/** Constructor jpa
	 * 
	 */
	public Operation() {
		super();
	}
	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + ", compte="
				+ compte.getId() + "]";
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
	/** Getter pour date
	 * @return date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**Setter pour date
	 * @param date date 
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/** Getter pour montant
	 * @return montant
	 */
	public double getMontant() {
		return montant;
	}
	/**Setter pour montant
	 * @param montant montant 
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/** Getter pour motif
	 * @return motif
	 */
	public String getMotif() {
		return motif;
	}
	/**Setter pour motif
	 * @param motif motif 
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}
	/** Getter pour compte
	 * @return compte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**Setter pour compte
	 * @param compte compte 
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
	
}
