package fr.raiyajin.echiquier;
import fr.raiyajin.projet_echec.*;
public class Case {	
	String affichage = "| ";
	Piece piece ;

	
	public Case(Piece piece) {	   /** Constructeur case avec piece **/
		this.piece = piece;
	}
	
	public Case() {	/** Constructeur vide pour case vide **/
		
	}


	/** toString permet affichage de case vide ou case pièce [voirtestPiece] **/
	public String toString() {
		String s = "";
		if (this.piece != null) {
			s = this.affichage + piece.getApparence() + " " ;	
		}
		else {
			s = this.affichage + "  　";
		}
		return s;
			
		
	}
}



	
