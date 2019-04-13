package model;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Groupe gr =new Groupe();
		Formation form=new Formation("SFSD","jgdsjhgfj",date,date);
		Apprenant appr= new Apprenant("hr_aziz","kazer1999","AZIZ","Rezak",date,"Semghoune",gr);
		form.ajoutApprenant(appr);
			
	}

}
