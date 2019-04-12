package model;

public class Notion {
	
	private String descriptionNotion;
	private Question[] questions;
	
	
	/**
	 * the constructors and methods 
	 */
	public Notion()
	{
	
	}
	public Notion(String descriptionNotion, Question[] questions) {
		
		this.descriptionNotion = descriptionNotion;
		this.questions = questions;
	}
	
	public void ajouterQuestion(Question question){
		
	}
	public void supprimerQuestion(Question question) {
		
	}
}
