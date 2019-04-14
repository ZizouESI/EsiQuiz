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
		Apprenant appr= new Apprenant("hr_aziz","kazer1999","AZIZ","Rezak",date,"Semghoune",gr);
		formation.ajoutApprenant(appr);
		appr= new Apprenant("hz_fodil","aziz","Fodil","Zine-eddine",date,"Boghni",gr);
		formation.ajoutApprenant(appr);
		appr= new Apprenant("s_sadeg","aziz","Sadeg","Souhila",date,"wiss",gr);
		formation.ajoutApprenant(appr);
		formation.afficheApprenants();
		/*Formation form=new Formation("ALSDS","jgdsjhgfj",date,date);
		Apprenant appr= new Apprenant("hr_aziz","kazer1999","AZIZ","Rezak",date,"Semghoune",gr);
		form.ajoutApprenant(appr);
		Apprenant appr1= new Apprenant("hr_aziz","kazer1999","AZIZ","Rezak",date,"Semghoune",gr);
		form.ajoutApprenant(appr1);
		form.afficheApprenants();
		
		Notion no1=new Notion("Modularité");
		Qcm question = new Qcm("Ca va chouya?");
		question.ajoutRepJuste("oui");
		question.ajoutRepFausse("non");
		question.ajoutRepFausse("wesh dekhlek");
		no1.ajouterQuestion(question);
		
		form.ajoutNotions(no1);
		no1=new Notion("Analyse");
		form.ajoutNotions(no1);
		System.out.println(form.getNotions()[0].getDescriptionNotion());
		form.getNotions()[0].getQuestions()[0].afficheEnonce();
		question=(Qcm) form.getNotions()[0].getQuestions()[0];
		question.afficheReponses();*/
		
	}

}
