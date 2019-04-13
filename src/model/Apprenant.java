package model;
import java.util.*;

public class Apprenant extends Utilisateur {
	private Date dateDeNaissance;
	private String adresse;
	private Groupe groupe;
	private Quiz[] quizzAcomp;
	private Quiz[] quizzNonAcompli;
	private Quiz[] quizzExpiré;
	
	/**
	 * the differents methods 
	 */
	
	public void afficherQuiz(int numQuiz)
	{
		
	}
	public Apprenant(String identifiant, String mdp,String nom,String prenom,Date dateDeNaissance, String adresse, Groupe groupe) {
		super(identifiant,mdp,nom,prenom);
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.groupe = groupe;
	}
	public void sauvgarderRep()
	{
		System.out.println("ok");
	}
	public void choisirQuiz(int numQuiz)
	{
		
	}
	public void validerQuiz()
	{
		
	}
}
