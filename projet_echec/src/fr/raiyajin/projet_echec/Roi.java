package fr.raiyajin.projet_echec;

public class Roi extends Piece{
	
	String nom = "Roi";
	
	public Roi(String nom, String apparence) {
		this.nom = nom;
		this.apparence = apparence;
	}
	public boolean coupPossible(int x, int y, int x2, int y2) {
		boolean possible = true;
		
		int couleur = Couleur();
		
		if (couleur == 1) {
			if (x-x2<= 1 && y-y2<=1 || x2-x<=1 && y2-y<=1) {
			
			}
		else {
			possible = false;
			
			}
		}
		return possible;
	}
	
	public boolean roiEstVaincu() {
		boolean Vaincu = false;
		if (Vaincu == false) {
			//Toutes les conditions qui mettent en échec le roi
		}
		return Vaincu;
			
 	}
}
