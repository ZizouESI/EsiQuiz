package model;
import java.util.*;
/**
 * 
 * @author Rezak
 *
 */
public class Formation {

	private String nom;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private Apprenant[] apprenants;
	private Quiz[] quizz;
	//private Formateur formateur; facultatif
	private Notion[] notions;
	
	//manipulation tableau 
	private int taiTabApp=0;
	private int taiTabQuiz=0;
	private int taiTabNotions=0;
	
	
	public Quiz[] getQuizz() {
		return quizz;
	}
	public void setQuizz(Quiz[] quizz) {
		this.quizz = quizz;
	}
	public Notion[] getNotions() {
		return notions;
	}
	public void setNotions(Notion[] notions) {
		this.notions = notions;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Formation(String nom, String description, Date dateDebut, Date dateFin) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.apprenants=new Apprenant[30];
		this.quizz=new Quiz[20];
		this.notions=new Notion[30];
	}
	//Ajouter apprenant 
	/**
	 * 
	 * @param apprenant: l'apprenant a ajouter
	 * @return false si erreur 
	 */
	public boolean ajoutApprenant(Apprenant apprenant)
	{
		if (apprenant!= null) {
			this.apprenants[taiTabApp]=apprenant;
			taiTabApp++;
		}else {//Erreur
			}
		return false;
	}
	//Ajouter des Notions
	/**
	 * 
	 * @param notion: la notion a ajouter 
	 * @return false si erreur
	 */
	public boolean ajoutNotions(Notion notion) {
		if (notion!= null) {
			this.notions[taiTabNotions]=notion;
			taiTabNotions++;
			return true;
		}else {//Erreur
			}
		return false;
	}
	//Ajouter un Quiz
	/**
	 * 
	 * @param quiz: le quiz a ajouter 
	 * @return false si erreur
	 */
	public boolean ajoutQuiz(Quiz quiz) {
		if (quiz!= null) {
			this.quizz[taiTabQuiz]=quiz;
			taiTabNotions++;
		}else {//Erreur
			}
		return false;
	}
	public void afficheNotions() {
		for(int i=0;i< taiTabNotions ; i++ ) {
			System.out.println(i+ "- "+notions[i].getDescriptionNotion());
		}
	}
	public void afficheApprenants() {
		for(int i=0;i< taiTabApp ; i++ ) {
			System.out.println((i+1)+"- "+apprenants[i].getIdentifiant());
		}
	}
	public void affichequiz() {
		for(int i=0;i< taiTabApp ; i++ ) {
			System.out.println(quizz[i].getNom());
		}
	}
}