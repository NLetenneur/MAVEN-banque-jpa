package Entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String numero;
	protected double solde;
	@ManyToOne
	@JoinColumn(name = "ID_Banque")
	private Banque banque;
	@ManyToMany
	@JoinTable(name = "cliComptes", joinColumns = @JoinColumn(name = "ID_Compte", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "ID_Cli", referencedColumnName = "id"))
	private Set<Client> clients;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param numero
	 * @param solde
	 * @param banque
	 * @param clients
	 */
	public Compte(String numero, double solde, Banque banque, Set<Client> clients) {
		this.numero = numero;
		this.solde = solde;
		this.banque = banque;
		this.clients = clients;
	}

	/**
	 * Constructor jpa
	 * 
	 */
	public Compte() {
		super();
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", banque=" + banque + ", clients="
				+ clients + "]";
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
	 * Getter pour numero
	 * 
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter pour numero
	 * 
	 * @param numero numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour solde
	 * 
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter pour solde
	 * 
	 * @param solde solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter pour banque
	 * 
	 * @return banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter pour banque
	 * 
	 * @param banque banque
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter pour clients
	 * 
	 * @return clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * Setter pour clients
	 * 
	 * @param clients clients
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}
