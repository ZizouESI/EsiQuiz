package model;

import java.util.ArrayList;

public class Qo extends Question {
	
	public Qo(String enonce) {
		super(enonce);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<String> bonneReponsesPropos�;
	private String reponse;
	
	public void evaluer()
	{
		/**
		 * la redifinition que on doit devlopper selon 
		 * la notation d'une Question ouverte donn�e 
		 * dans le livrable
		 */
	}
	public void ajoutProposition(String propo) {
		/**
		 * ajouter une propostion au tableau de propos 
		 */
		this.bonneReponsesPropos�.add(propo);
	}
	public void repondre(String rep) {
		// TODO Auto-generated method stub
		this.reponse=rep;
	}

	
}
