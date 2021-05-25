package fr.raiyajin.projet_echec;

public abstract class Piece {
	String nom;
	String apparence;
	int x;
	int y;
	
	
	public Piece() {
		nom = "undefined";
		apparence = "undefined";
		
	}

	
	public Piece(String nom, String app) {
		this.nom = nom;
		this.apparence = app;
		
	}
	
	public String getNom() {
		return this.nom;
		
	}
	
	public void setNom(String nom) {
		this.nom = nom;
		
	}
	
	public String getApparence() {
		return this.apparence;
		
	}
	
	public void setApparence(String apparence) {
		this.apparence = apparence;
		
	}
	
	public String toString() {
		String s ;
		s= new String ("Nom pièce : "+this.nom + "Apparence :" + this.apparence);
		return s ;
	}
	
	public abstract int coupPossible(int x, int y, int x2, int y2);


	
	public void deplacement() {
		//TODO
	}
	
	public void manger() {
		//TODO
	}
}