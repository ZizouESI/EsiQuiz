package model;
import java.util.*;
public class Quiz {

	private String Nom;
	private Date dateDebut;
	private Date dateFin;
	private ArrayList<Notion> notion;
	private float score;
	private float tauxAccomplissement;
	
	
	public float getTauxAccomplissement() {
		return tauxAccomplissement;
	}
	public void setTauxAccomplissement(float tauxAccomplissement) {
		this.tauxAccomplissement = tauxAccomplissement;
	}
	/**
	 * the constructors and methods 
	 */
	
	public Quiz()
	{
		this.notion=new ArrayList<Notion>();
	}
	public Quiz(String nom, Date dateDebut, Date dateFin, float score) {
		
		Nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.score = score;
		this.notion=new ArrayList<Notion>();
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public void ajoutNotions(Notion notion, int nbQuestions ) {
		//return this.notion.add(notion);
		int j,i=0;
		Notion no1;
		no1=new Notion(notion.getDescriptionNotion());
		while(i<nbQuestions) {
			j=(int) (Math.random() * ( notion.getQuestions().size() ));
			if(no1.getQuestions().contains(notion.getQuestion(j))) {
				continue;
			}
			else {
				no1.ajouterQuestion(notion.getQuestion(j));
				i++;
			}
		}
		this.notion.add(no1);
	}
	public boolean supprimerNotion(Notion notion) {
		return this.notion.remove(notion);
	}
	
	public void afficherQuiz() {
		Iterator<Notion> it= notion.iterator();
		System.out.println("***************************");
		while (it.hasNext()) {
			Notion not=it.next();
			not.afficheQuestions();
			
		}
	}
	public void repondre(Question ques,ArrayList<String> rep) {
		Iterator<Notion> it= notion.iterator();
		boolean stop=false;
		Notion no1 = null;
		while(it.hasNext() && !stop) {
			no1=it.next();
			if (no1.getQuestions().contains(ques)) {
				stop=true;
			}
		}
		int i=0;
		Iterator<Question> it1= no1.getQuestions().iterator();
		while(it1.hasNext()) {

			Question quu=it1.next();
			if (quu==ques) {
				for(String s : rep) {
					if (ques instanceof Qcm ) ((Qcm)ques).repondre(s);
					if (ques instanceof Qcu ) ((Qcu)ques).repondre(s);
				}
			}
			i++;
		}
		//calculer le taux d accomplissement
	}
}
