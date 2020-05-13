package model;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation formateur
		Formateur formateur=new Formateur();
		Date date = new Date();
		Groupe gr =new Groupe();
		//une formation
		Formation formation=new Formation("ALSDS","Cours 1ere annne s1",date,date);
		//Ajout de 3 Apprenants
		Apprenant appr= new Apprenant();
		formation.ajoutApprenant(appr);
		appr= new Apprenant();
		formation.ajoutApprenant(appr);
		appr= new Apprenant();
		formation.ajoutApprenant(appr);
		//affichage des apprenants
		formation.afficheApprenants();
		//suppression de l'apprenant1
		formation.suppApprenant(1);
		formation.afficheApprenants();
		//mise a jour d un apprenant
		formation.majApprenant(0, appr);
		formation.afficheApprenants();
		
	}

}
