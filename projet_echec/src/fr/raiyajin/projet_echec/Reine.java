package fr.raiyajin.projet_echec;

public class Reine extends Piece{
	
	String nom = "Reine";
	
	public Reine(String nom, String apparence) {
		this.nom = nom;
		this.apparence = apparence;
	}
	public boolean coupPossible(int x, int y, int x2, int y2) {
		boolean possible = true;
		
		int couleur = Couleur();
		
		if (couleur == 1) {
			if (x-x2!=0 && y-y2!=0 && x-x2==y-y2 || x2-x!=0 && y2-y!=0 && x2-x==y2-y) {
				
			}
				
			
		}
		else {
			possible = false;
			
		}
		
		return possible;
	};
	

}
