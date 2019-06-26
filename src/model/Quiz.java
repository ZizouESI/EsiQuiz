package model;
import java.util.*;
public class Quiz {

	private String Nom;
	private Date dateDebut;
	private Date dateFin;
	private ArrayList<Notion> notion;
	private float score;
	
	private int taiTabNotions=0;
	/**
	 * the constructors and methods 
	 */
	
	public Quiz()
	{
		
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
		
		
	}
	public boolean supprimerNotion(Notion notion) {
		return this.notion.remove(notion);
	}
	
}
