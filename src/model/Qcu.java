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
		this.reponse.add(reponse);
		this.reponsesFausses.add(reponse);
	}
	public void ajoutRepJuste(String reponse) {
		this.reponseJuste=reponse;
		this.reponse.add(reponse);
	}
	public void afficheReponses()
	{
		Iterator<String> it= reponse.iterator();
		int i=1;
		while (it.hasNext()) {
			System.out.println(i+"-"+ it.next());
			i++;
		
	}
}}
