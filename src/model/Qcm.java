package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Qcm extends Question {
	
	private int nbPropositions;
	private ArrayList<String> reponsesJustes;
	private ArrayList<String> reponsesFausses;
	private ArrayList<String> reponses;
	
	
	
	public Qcm(String enonce) {
		super(enonce);
		this.reponses= new ArrayList<String>();
		this.reponsesFausses=new ArrayList<String>();
		this.reponsesJustes=new ArrayList<String>();
	}
	
	public void evaluer()
	{
		
	}
	
	public boolean ajoutRepJuste(String reponse) {
		if (reponse!= "") {
			this.reponsesJustes.add(reponse);
			
			return true;
		}else {//Erreur
			}
		return false;
	}
	public boolean ajoutRepFausse(String reponse) {
		if (reponse!= "") {
			this.reponsesJustes.add(reponse);
			
			return true;
		}else {//Erreur
			}
		return false;
	}
	public boolean ajoutRep(String reponse) {
		if (reponse!= "") {
			this.reponses.add(reponse);
			
			return true;
		}else {//Erreur
			}
		return false;
	}
	public void afficheReponses()
	{
		Iterator<String> it= reponsesJustes.iterator();
		int i=1;
		while (it.hasNext()) {
			System.out.println(i+"-"+ it.next());
			i++;
		
	}
		Iterator<String> it1= reponsesFausses.iterator();
		
		while (it1.hasNext()) {
			System.out.println(i+"-"+ it1.next());
			i++;
		
	}
}
}
