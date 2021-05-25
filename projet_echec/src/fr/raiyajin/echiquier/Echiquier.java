package fr.raiyajin.echiquier;
import fr.raiyajin.projet_echec.*;
public class Echiquier {
	Case[][] echiquier;

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
}