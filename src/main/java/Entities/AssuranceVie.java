package Entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;

@Entity
public class AssuranceVie extends Compte{
	
	protected Date dateFin;
	protected double taux;

	/** Constructor
	 * @param id
	 * @param numero
	 * @param solde
	 * @param banque
	 * @param clients
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(String numero, double solde, Banque banque, Set<Client> clients, Date dateFin,
			double taux) {
		super(numero, solde, banque, clients);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	/** Constructor jpa
	 * 
	 */
	public AssuranceVie() {
		super();
	}

	@Override
	public String toString() {
		return "AssuranceVie [id=" + id + ", numero=" + numero + ", solde="
				+ solde + "dateFin=" + dateFin + ", taux=" + taux + "]";
	}

	/** Getter pour taux
	 * @return taux
	 */
	public double getTaux() {
		return taux;
	}

	/**Setter pour taux
	 * @param taux taux 
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Getter pour dateFin
	 * @return dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**Setter pour dateFin
	 * @param dateFin dateFin 
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	
}
