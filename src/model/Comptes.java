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
	/**
	 * Afficher comptes , affiche juste les identifiants des comptes
	 */
	public void AfficherComptes() {
		Iterator<Compte> it=comptes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getUtilisateur().getIdentifiant());
		}
	}
	public boolean  Authentifiation(String NomUtilisateur,String motDePasse) throws CompteException{
		Utilisateur util=null;
		boolean IdExiste=false;
		Iterator<Compte> it =comptes.iterator();
		while((it.hasNext())&(IdExiste == false)) {
			util=it.next().getUtilisateur();
			if(util.getIdentifiant() == NomUtilisateur) {
				IdExiste=true;
				
			}
		}
		if (IdExiste == false) {
			throw new CompteException();
		}
		else {
			if (util.getMotDePasse() == motDePasse) {
				return true;
			}
			else {
				throw new CompteException();
			}
		}
	}
}
