package model;
import java.util.*;
public class Formateur extends Utilisateur {
	private ArrayList<Formation> formations;
	
	
	
	/**
	 * the constructor 
	 */
	public Formateur()
	{
		
	}
	
	public Formateur(String identifiant, String motDePasse, String nom, String prenom)
	{
		super(identifiant,motDePasse, nom, prenom);
		formations=new ArrayList<Formation>();
	}
	 
	
	public ArrayList<Formation> getFormations() {
		return formations;
	}


	

	public boolean creerUnCompte(String nom,String prenom,Date dateDeNaissance,String adresse)
	{
		
		return false;
	}
	/**
	 * 
	 * @param compte
	 * @param comptes qui sera le seul hashSet definie 
	 * @param nouveauMotDePasse
	 */
	public void modifierUnCompte(Compte compte,Comptes comptes,String nouveauMotDePasse) {
		
		comptes.modifierCompte(compte, nouveauMotDePasse);
	
	}
	public void supprimerUnCompte(Compte compte,Comptes comptes) {
		comptes.supprimerCompte(compte);
	}
	
	//ajouter une formation 
	public boolean ajouterFormation(Formation formation)
	{
		if(formation != null)
		{
			this.formations.add(formation);
			return true;
		}
		
		return false;
	}
	//Affichage des formation 
	public void afficherFormations()
	{
		Iterator<Formation> it=formations.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
