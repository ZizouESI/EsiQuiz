package model;
import java.util.*;
public class Quiz {

	private String Nom;
	private Date dateDebut;
	private Date dateFin;
	private Notion[] notion;
	private float score;
	
	/**
	 * the constructors and methods 
	 */
	public Quiz()
	{
		
	}
	public Quiz(String nom, Date dateDebut, Date dateFin, Notion[] notion, float score) {
		
		Nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.notion = notion;
		this.score = score;
	}
	
}
