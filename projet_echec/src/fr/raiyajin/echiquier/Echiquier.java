package fr.raiyajin.echiquier;
import fr.raiyajin.projet_echec.*;
public class Echiquier {
	Case[][] echiquier;
	Piece piece;

	//pièce noires;
	Pion Pnoir = new Pion("Pion", "♟️");
	Cavalier Cnoir = new Cavalier("Cavalier", "♞");
	Fou Fnoir = new Fou("Fou", "♝");
	Tour Tnoir = new Tour("Tour", "♜");
	Reine Dnoir = new Reine("Reine", "♛");
	Roi Rnoir = new Roi("Roi", "♚");
	
	//pièce blanches;
	Pion Pblanc = new Pion("Pion", "♙");
	Cavalier Cblanc = new Cavalier("Cavalier", "♘");
	Fou Fblanc = new Fou("Fou", "♗");
	Tour Tblanc = new Tour("Tour", "♖");
	Reine Dblanc = new Reine("Reine", "♕");
	Roi Rblanc = new Roi("Roi", "♔");

	


	
	public Echiquier() {
		this.echiquier = new Case[8][8];
	}

	
	public void initialiser() {
		echiquier[0][0] = new Case(Tnoir);
		echiquier[0][1] = new Case(Cnoir);
		echiquier[0][2] = new Case(Fnoir);
		echiquier[0][3] = new Case(Dnoir);
		echiquier[0][4] = new Case(Rnoir);
		echiquier[0][5] = new Case(Fnoir);
		echiquier[0][6] = new Case(Cnoir);
		echiquier[0][7] = new Case(Tnoir);
		for (int i = 0; i < 8; i++) {
			echiquier[1][i] = new Case(Pnoir);
		}
		for (int j = 2; j < 6; j++) { 
			for (int i = 0; i < 8; i++) {
			echiquier[j][i] = new Case();
			}
		}
		for (int i = 0; i < 8; i++) {
			echiquier[6][i] = new Case(Pblanc);
		}
		echiquier[7][0] = new Case(Tblanc);
		echiquier[7][1] = new Case(Cblanc);
		echiquier[7][2] = new Case(Fblanc);
		echiquier[7][3] = new Case(Dblanc);
		echiquier[7][4] = new Case(Rblanc);
		echiquier[7][5] = new Case(Fblanc);
		echiquier[7][6] = new Case(Cblanc);
		echiquier[7][7] = new Case(Tblanc);
		
	}
		
		
		
			
	public void afficher() {
		String s = "-----------------------------------\n";
		for (int j = 0; j < 8; j++) { 
			for (int i=0;i<8;i++) {
			s = s + echiquier[j][i].toString();
			
			}
			s = s + "|\n-----------------------------------\n";
		}
		System.out.println(s); 
	}
	public Piece getPiece(int x, int y) {
		return echiquier[x][y].getPiece();
	}
	
	public void setPiece(int x, int y) {
		if (piece != null) {
			piece.setX(x);
			piece.setY(y);
		}
		
	}
	public boolean cheminLibre(int x1, int y1, int x2, int y2) {

		int xDistance = x2 - x1;
		int yDistance = y2 - y1;
		int xDir = 0;
		int yDir = 0;
		int size = 0;

		if (xDistance < 0) {
			xDir = -1;
		} else if (xDistance > 0) {
			xDir = 1;
		}

		if (yDistance < 0) {
			yDir = -1;
		} else if (yDistance > 0) {
			yDir = 1;
		}

		if (xDistance != 0) {
			size = Math.abs(xDistance) - 1;
		} else {
			size = Math.abs(yDistance) - 1;
		}


		for (int i = 0; i < size; i++) {
			x1 += xDir;
			y1 += yDir;

			if (getPiece(x1, y1) != null) {
				return false;
			}
		}
		return true;

	}
	
	public void deplacer(int x, int y, int x2, int y2) { //à changer sous format [a0-h8].
		if (echiquier[x2][y2].getPiece() == null) { //vérifie que la case soit vide.
			echiquier[x][y].getPiece();
			if (piece.coupPossible(x, y , x2, y2) == true) {
				echiquier[x2][y2] = new Case(piece);
				echiquier[x][y] = new Case();
			}
			
	
	}
}
}