package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Notion {
	
	private String descriptionNotion;
	private ArrayList<Question> questions;
	
	
	
	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	/**
	 * the constructors and methods 
	 */
	public Notion(String descriptionNotion)
	{
		this.descriptionNotion=descriptionNotion;
		this.questions=new ArrayList<Question>();
	}
	
	public String getDescriptionNotion() {
		return descriptionNotion;
	}

	public void setDescriptionNotion(String descriptionNotion) {
		this.descriptionNotion = descriptionNotion;
	}

	public boolean ajouterQuestion(Question question){
		if (question!= null) {
			this.questions.add(question);
			return true;
		}else {//Erreur
			}
		return false;
	}
	
	public void supprimerQuestion(int num) {
		
	}
	
	public void afficheQuestions() {
		Iterator<Question> it= questions.iterator();
		int i=1;
		while (it.hasNext()) {
			Question ques=it.next();
			System.out.println(i+"-"+ ques.getEnonce());
			
			if (ques instanceof Qcm ) ((Qcm)ques).afficheReponses();
			if (ques instanceof Qcu ) ((Qcu)ques).afficheReponses();
			i++;
			
		}
	}
	
	public Question getQuestion(int n) {
		return this.questions.get(n);
		
	}
}
