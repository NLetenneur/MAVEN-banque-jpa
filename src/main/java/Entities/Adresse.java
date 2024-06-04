package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adresse")
public class Adresse{
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected int numero;
	protected String rue;
	protected String codePostal;
	protected String ville;
	
	/** Constructor
	 * @param id
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(int numero, String rue, String codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	/** Constructor jpa
	 * 
	 */
	public Adresse() {
		super();
	}
	@Override
	public String toString() {
		return numero + ", " + rue + " " + codePostal + " "+ ville;
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
	/** Getter pour numero
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}
	/**Setter pour numero
	 * @param numero numero 
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/** Getter pour rue
	 * @return rue
	 */
	public String getRue() {
		return rue;
	}
	/**Setter pour rue
	 * @param rue rue 
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/** Getter pour codePostal
	 * @return codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**Setter pour codePostal
	 * @param codePostal codePostal 
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/** Getter pour ville
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}
	/**Setter pour ville
	 * @param ville ville 
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
