package model;
import java.util.*;
public class Formateur extends Utilisateur {
	private Formation[] formations;
	
	//manipulation de tableau
	private int tailTabForm=0;
	
	/**
	 * the constructor 
	 */
	public Formateur()
	{
		
	}
	
	public Formateur(String identifiant, String motDePasse, String nom, String prenom)
	{
		super(identifiant,motDePasse, nom, prenom);
		this.formations=new Formation[1];
	}
	 
	
	public Formation[] getFormations() {
		return formations;
	}


	

	public boolean creerUnCompte(String nom,String prenom,Date dateDeNaissance,String adresse)
	{
		
		return false;
	}
	/*public void modifierUnCompte() {
		
	}
	public void supprimerUnCompte() {
		
	}*/
	
	//ajouter une formation 
	public boolean ajouterFormation(Formation formation)
	{
		if(formation != null)
		{
			this.formations[tailTabForm]=formation;
			tailTabForm++;
			return true;
		}
		
		return false;
	}
	//Affichage des formation 
	public void afficherFormations()
	{
		for(int i=0;i<tailTabForm;i++)
		{
			System.out.println(formations[i]);
		}
	}
}
