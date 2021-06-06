package fr.raiyajin.projet_echec;

public class Cavalier extends Piece{
	int x;
	int y;
	String nom = "Cavalier";
	
	public Cavalier(String nom, String apparence) {
		this.nom = nom;
		this.apparence = apparence;
	}
	

	
	public boolean coupPossible(int x, int y, int x2, int y2) {
		boolean possible = true;
		
		int couleur = Couleur();
		
		if (couleur == 1 || couleur==2) { //La couleur n'influence pas la direction du déplacement
			if (x2==x || x2==x+2 || x2==x-2) {
				if (y-y2==-2 || y-y2==-1 || y-y2==1 || y-y2==2) {		 
			}
					
		}
		else {
			possible = false;
			
		}
		}
		return possible;
	};
	

}



