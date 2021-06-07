package fr.raiyajin.jeu;
import java.util.*;
import fr.raiyajin.echiquier.*;
import fr.raiyajin.projet_echec.*;

public class Partie {
	int[] tab;
	public void sauvegarderPartie() {
		
	}


	
	

	

	
	
	    
	
	public static void main(String[] args) {
		Joueur Joueur1 = new Joueur();
		Joueur Joueur2 = new Joueur();
		Echiquier board = new Echiquier();
		board.initialiser();
		board.afficher();

		int tour = 0;
		while (tour<=10) { // à remplacer avec While (roiEstVaincu() == false || Not [impossible pour les 2 joueurs de l'emporter])
			if (tour%2 == 0) {
				System.out.println("Tour du joueur 1");
				//traduire input en meth avec .deplacer()
				coord tabl = new coord();
				int[] tab = tabl.getTab();
				board.deplacer(tab[0], tab[1], tab[2], tab[3]);
				board.initialiser();
				board.afficher();
				tour++;
				
			}
			else {
				System.out.println("Tour du joueur 2");
				//traduire input en meth avec .deplacer()
				coord tabl = new coord();
				int[] tab = tabl.getTab();
				
				board.deplacer(tab[0], tab[1], tab[2], tab[3]);
				board.initialiser();
				board.afficher();
				tour++;
			}
		} /**
		if (roiEstVaincu() = 1) { //1 = noir
			System.out.println("Le joueur 2 gagne");
		else if roiEstVaincu (roiEstVaincu() = 2){
			System.out.println("Le joueur 1 gagne"); 
			}
		else {
			System.out.println("Ex-aequo")
		**/
	}		
}
