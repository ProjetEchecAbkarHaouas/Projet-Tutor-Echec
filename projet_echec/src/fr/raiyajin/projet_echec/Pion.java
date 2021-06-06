package fr.raiyajin.projet_echec;

public class Pion extends Piece{
	
	String nom = "Pion";

	
	public Pion(String nom, String apparence) {
		this.nom = nom;
		this.apparence = apparence;
	}
	public boolean coupPossible(int x, int y, int x2, int y2) {
		boolean possible = true;
		
		int couleur = Couleur();
		
		if (couleur == 1) { //Les pions blancs ne vont que dans une direction
			if (x2-x <= 2 && x2-x!=0) {
				if (y == y2) {
				 
			}
				else {
					possible = false;		
		} }
		else {
			possible = false;		
		}
			
		}
		else if (couleur==2){ //Les pions noirs ne vont que dans une direction
			if (x2-x >=-2 && x2-x!=0) {
				if (y == y2) {			 
			}
				else {
					possible = false;
				
			
		} }
	}
		return possible;
	}
}
