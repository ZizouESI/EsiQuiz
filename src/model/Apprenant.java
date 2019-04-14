package model;
import java.util.*;

public class Apprenant extends Utilisateur {
	private Date dateDeNaissance;
	private String adresse;
	private Groupe groupe;
	private Quiz[] quizzAcomp;
	private Quiz[] quizzNonAcompli;
	private Quiz[] quizzExpiré;
	
	//manipulation des tableaux
	private int taiTabQuizAcomp=0;
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

	}
	/**
	 * 
	 * @param numQuiz : le numero du quizz dans le tableau des quizzNonAcompli
	 * @return le quiz en question
	 */
	public Quiz choisirQuiz(int numQuiz)
	{
		//on peut afficher ses question/reponses ici ou bien dans le main si on veut "pour le scenario"
		return(quizzNonAcompli[numQuiz]);
	}
	
	public void validerQuiz(Quiz quiz)
	{
		
	}
}
