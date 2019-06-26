package model;
import java.util.*;

public class Comptes {
	Set<Compte> comptes;
	public Comptes() {
		comptes = new HashSet<Compte>();
		
	}
	public Set<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	public boolean AjouterComptes(Compte compte) {
		return comptes.add(compte);
	}
	public boolean supprimerCompte(Compte compte) {
		return comptes.remove(compte);
	}
	/**
	 * Afficher comptes , affiche juste les identifiants des comptes
	 */
	public void AfficherComptes() {
		Iterator<Compte> it=comptes.iterator();
		Compte cmpt;
		while(it.hasNext()) {
			cmpt=it.next();
			System.out.println(cmpt.getUtilisateur().getIdentifiant()+"  "+cmpt.getUtilisateur().getMotDePasse());
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
	
	public void modifierCompte(Compte compte,String nouveauMotDePasse) {
		if (compte != null) {
			if (this.comptes.contains(compte)){
				Iterator<Compte> it=comptes.iterator();
				boolean bool=false;
				Compte cmptRechercher=null;
				while(it.hasNext()&(bool==false)) {
					cmptRechercher=it.next() ;
					if(cmptRechercher== compte) {
						bool=true;
					}
				}
				cmptRechercher.getUtilisateur().setMotDePasse(nouveauMotDePasse);
			}
			else
			{
				System.out.println("Le compte ne figure pas dans la liste des comptes");
			}
		}
	}
	
}
