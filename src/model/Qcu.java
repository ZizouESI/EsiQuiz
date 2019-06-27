package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Qcu extends Question{
	
	private String reponseJuste;
	private ArrayList<String> reponsesFausses;
	private ArrayList<String> reponse;
	
	public Qcu(String enonce) {
		super(enonce);
		reponsesFausses=new ArrayList<String>();
		reponse=new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	public void evaluer() {
		
	}
	public void ajoutRepFausse(String reponse) {
		
		this.reponsesFausses.add(reponse);
	}
	public void ajoutRepJuste(String reponse) {
		this.reponseJuste=reponse;
		
	}
	public boolean repondre(String reponse) {
		if (reponse!= "") {
			this.reponse.add(reponse);
			
			return true;
		}else {//Erreur
			}
		return false;
	}
	public void afficheReponses()
	{
		
		int i=1;
		
			System.out.println(i+"-"+ reponseJuste);
			i++;
		Iterator<String> it1= reponsesFausses.iterator();
		
		while (it1.hasNext()) {
			System.out.println(i+"-"+ it1.next());
			i++;
			}
}
	}
