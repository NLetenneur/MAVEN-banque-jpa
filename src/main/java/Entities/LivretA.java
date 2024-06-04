package Entities;

import java.util.Set;

import jakarta.persistence.Entity;

@Entity
public class LivretA extends Compte{

	protected double taux;

	/** Constructor
	 * @param id
	 * @param numero
	 * @param solde
	 * @param banque
	 * @param clients
	 * @param taux
	 */
	public LivretA(String numero, double solde, Banque banque, Set<Client> clients, double taux) {
		super(numero, solde, banque, clients);
		this.taux = taux;
	}

	/** Constructor jpa
	 * 
	 */
	public LivretA() {
		super();
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + ", id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
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
	
	
	
	
}
