package Entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	protected String prenom;
	protected LocalDate dateNaissance;
	protected Adresse adresse;
	
	@ManyToMany
	@JoinTable(name="cliComptes",
	joinColumns= @JoinColumn(name="ID_Compte", referencedColumnName="id"),
	inverseJoinColumns= @JoinColumn(name="ID_Cli", referencedColumnName="id")
	)
	private Set<Compte> comptes;
	

}
