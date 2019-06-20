package model;

public class Compte implements Comparable<Compte> {
	private Utilisateur utilisateur;
	
	public Compte() {
		
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public int compareTo(Compte cmpt) {
		return this.utilisateur.compareTo(cmpt.getUtilisateur());
	}
	
	public int hashCode() {
		if (this.utilisateur==null) {
			return 0;
		}
		return this.utilisateur.hashCode();
	}
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Compte)) return false;
		Compte cmpt= (Compte)o;
		if (this.utilisateur == null) {
			if(cmpt.getUtilisateur() == null)
				return false;
		}else if(! this.utilisateur.equals(cmpt.getUtilisateur()))
			return false;
		return true;
	}
	
}
