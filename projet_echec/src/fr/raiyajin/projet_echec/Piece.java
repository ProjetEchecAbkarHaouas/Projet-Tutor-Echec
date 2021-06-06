package fr.raiyajin.projet_echec;

public abstract class Piece {
	String nom;
	String apparence;
	int x;
	int y;
	String[] Blanc = {"♔", "♕", "♖", "♗", "♘", "♙"};
	String[] Noir = {"♚", "♛", "♜", "♝", "♞", "♟"};
	public boolean premiereAction;
	
	public Piece() {
		nom = "undefined";
		apparence = "undefined";
		
	}
	
	public int Couleur() {
		int couleur = 0;
		for (int i=0; i<Blanc.length; i++) {
			if (this.apparence == Blanc[i]) {
				couleur = 1;
				
			}
			else if (this.apparence == Noir[i]){
				couleur = 2;
			}
		}
		return couleur;
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
	
	public int getX() {
		return this.x;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int newY) {
		this.y = newY;
	}
	
	public abstract boolean coupPossible(int x, int y, int x2, int y2);


	
	public void deplacement(int x, int y, Piece nom) {
		if (this.coupPossible(nom.getX(),nom.getY(), x, y) != true) {
			System.out.println("Impossible d'atteindre cette case avec cette pièce.");
		}

		else {
			nom.setX(x);
			nom.setY(y);
		}


		}
	
	
	public void manger() {
		//TODO
	}
}