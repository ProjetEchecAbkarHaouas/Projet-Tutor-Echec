package fr.raiyajin.projet_echec;

public class Fou extends Piece{
	
	String nom = "Fou";
	
	public Fou(String nom, String apparence) {
		this.nom = nom;
		this.apparence = apparence;
	}
	public boolean coupPossible(int x, int y, int x2, int y2) {
		boolean possible = true;
		
		int couleur = Couleur();
		
		if (couleur == 1 || couleur==2) { //La couleur n'influence pas la direction du déplacement
			if (x2!=x && y2!=y) {
				if (x2 == y2) {
				 
			}
				
			
		}
		else {
			possible = false;
			
		}
		}
		return possible;
	};
	

}
