package fr.raiyajin.jeu;
import java.util.*;
import fr.raiyajin.echiquier.*;
import fr.raiyajin.projet_echec.*;

public class Partie {
	
	public void sauvegarderPartie() {
		
	}
	public void finPartie() {
		/*if roiEstVaincue = True
		 * SysOut Joueur vainqueur.
		 */
	}

		
	
	
	public void init() {
		System.out.println("Sélectionner une case départ arrivé ainsi : <a1 a2>");
		Scanner nomCaseDep = new Scanner(System.in);
		
		
	}
	
	public static void main(String[] args) {
		Joueur Joueur1 = new Joueur();
		Joueur Joueur2 = new Joueur();
		Echiquier board = new Echiquier();
		board.initialiser();
		
		int tour = 1;
		while (roiEstVaincu() == true) {
			if (tour%2 == 0) {
				System.out.println("Tour du joueur 1");
				//traduire input en meth avec .deplacer()
				
			}
			else {
				System.out.println("Tour du joueur 2");
				//traduire input en meth avec .deplacer()
			}
		}
		


		
	}
}
