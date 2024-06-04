import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Entities.Adresse;
import Entities.AssuranceVie;
import Entities.Banque;
import Entities.Client;
import Entities.Compte;
import Entities.LivretA;
import Entities.Operation;
import Entities.Virement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Adresse ad01 = new Adresse(1, "rue des Pivoines", "75003", "Paris");
		em.persist(ad01);
		Adresse ad02 = new Adresse(46,"rue des rosiers", "44000", "Nantes");
		em.persist(ad02);
		Adresse ad03 = new Adresse(23,"rue du Myosotis", "20000", "Ajaccio");
		em.persist(ad03);
		
		@SuppressWarnings("deprecation")
		Date dN01 = new Date(39, 9, 12);
		Date dN02 = new Date(47, 8, 19);
		Date dN03 = new Date(66, 3, 17);
		

		Client cli01 = new Client("Gosling", "Paula", dN01, ad01, null);
		em.persist(cli01);
		Client cli02 = new Client("Lee", "Tanith", dN02, ad02, null);
		em.persist(cli02);
		Client cli03 = new Client("Dufour", "Catherine", dN03, ad03, null);
		em.persist(cli03);
		
		Set<Client> listCli01 = new HashSet<Client>();
		listCli01.add(cli01);
		listCli01.add(cli02);
		Set<Client> listCli02 = new HashSet<Client>();
		listCli01.add(cli01);
		Set<Client> listCli03 = new HashSet<Client>();
		listCli01.add(cli03);


		Banque b01 = new Banque("Banque du polar", null);
		em.persist(b01);
		Banque b02 = new Banque("Banque de la SF", null);
		em.persist(b02);
		Banque b03 = new Banque("Banque des romans de genre français", null);
		em.persist(b03);

		Compte cpt01 = new Compte("esf4575", 25000.00, b01, listCli01);
		em.persist(cpt01);
		
		@SuppressWarnings("deprecation")
		Date df01 = new Date(125, 11, 31);
		AssuranceVie cpt02 = new AssuranceVie("tyj6+45", 342123.58, b02, listCli02,df01, 2.3);
		em.persist(cpt02);
		
		LivretA cpt03 = new LivretA("452dfv", 68406.36, b03, listCli03, 5.2);
		em.persist(cpt03);
		
		LocalDateTime dOp01 = LocalDateTime.now();
		
		Virement op01 = new Virement(dOp01, 100.50, "test", cpt01, "moi");
		em.persist(op01);
		
		Operation op02 = new Operation(dOp01, -56.25, "dépense surprise", cpt03);
		em.persist(op02);
		
		transaction.commit();
		
		

	}

}
