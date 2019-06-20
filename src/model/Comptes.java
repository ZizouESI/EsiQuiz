package model;
import java.util.*;

public class Comptes {
	Set<Compte> comptes;
	public Comptes() {
		comptes = new HashSet<Compte>();
		
	}
	public boolean AjouterComptes(Compte compte) {
		return comptes.add(compte);
	}
	public boolean  Authentifiation(String utilisateur,String motDePasse) throws CompteException{
		/**
		 * a completer 
		 */
		return false;
	}
}
