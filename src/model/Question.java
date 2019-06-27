package model;

import java.util.Iterator;

abstract class Question {
   private  String enonce;
   private String Type;
   //private Notion notion; facultatif
   /**
    * the methods
    */
   
       /**
	    * c'est la methode que va redefinire chaque type de question 
	    * Qo,Qcm,Qcu
	    */
   
   public abstract void evaluer();
   
   public String getEnonce() {
		return enonce;
	}
	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
public Question(String enonce) {
	   super();
	   this.enonce = enonce;
   }
   public void afficheEnonce() {
	   System.out.println(enonce);
   }
  
}
