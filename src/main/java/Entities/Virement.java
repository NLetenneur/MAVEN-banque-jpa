package Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class Virement extends Operation {

	protected String beneficiaire;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 * @param beneficiaire
	 */
	public Virement(LocalDateTime date, double montant, String motif, Compte compte, String beneficiaire) {
		super(date, montant, motif, compte);
		this.beneficiaire = beneficiaire;
	}

	/**
	 * Constructor
	 * 
	 */
	public Virement() {
		super();
	}

	@Override
	public String toString() {
		return "Virement [ id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "beneficiaire="
				+ beneficiaire + "]";
	}

	/** Getter pour beneficiaire
	 * @return beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**Setter pour beneficiaire
	 * @param beneficiaire beneficiaire 
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	

}
