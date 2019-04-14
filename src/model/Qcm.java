package model;

public class Qcm extends Question {
	
	private int nbPropositions;
	private String[] reponsesJustes=new String[4];
	private String[] reponsesFausses=new String[4];
	private String[] reponses=new String[4];
	
	private int taiTabRepJuste=0;
	private int taiTabRepFausse=0;
	private int taiTabRep=0;
	
	
	public Qcm(String enonce) {
		super(enonce);
	}

	public void evaluer()
	{
		
	}
	
	public boolean ajoutRepJuste(String reponse) {
		if (reponse!= "") {
			reponsesJustes[taiTabRepJuste]=reponse;
			taiTabRepJuste++;
			return true;
		}else {//Erreur
			}
		return false;
	}
	public boolean ajoutRepFausse(String reponse) {
		if (reponse!= "") {
			this.reponsesJustes[taiTabRepJuste]=reponse;
			taiTabRepJuste++;
			return true;
		}else {//Erreur
			}
		return false;
	}
	public void afficheReponses()
	{
		for (int i=0;i<taiTabRepJuste;i++) {
			System.out.println(reponsesJustes[i]);
		}
		for (int i=0;i<taiTabRepFausse;i++) {
			System.out.println(reponsesFausses[i]);
		}
		
	}
}
