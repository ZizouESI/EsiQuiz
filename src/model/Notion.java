package model;

public class Notion {
	
	private String descriptionNotion;
	private Question[] questions=new Question[20];
	
	private int taiTabQues=0;
	
	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	/**
	 * the constructors and methods 
	 */
	public Notion(String descriptionNotion)
	{
		this.descriptionNotion=descriptionNotion;
	}
	
	public String getDescriptionNotion() {
		return descriptionNotion;
	}

	public void setDescriptionNotion(String descriptionNotion) {
		this.descriptionNotion = descriptionNotion;
	}

	public boolean ajouterQuestion(Question question){
		if (question!= null) {
			this.questions[taiTabQues]=question;
			taiTabQues++;
			return true;
		}else {//Erreur
			}
		return false;
	}
	
	public void supprimerQuestion(Question question) {
		
	}
}
