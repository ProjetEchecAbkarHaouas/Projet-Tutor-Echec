package fr.raiyajin.jeu;
import fr.raiyajin.projet_echec.*;
import java.util.*;


public class Joueur {
	private String nom;
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public Joueur() { //Constructeur vide pour la méthode init
		this.init();
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void init() {

		System.out.println("Entrez le nom du joueur");
		Scanner nom_joueur = new Scanner(System.in);
		this.setNom(nom_joueur.nextLine());
		System.out.println("Le nom du joueur est: "+ this.getNom());
		
		
	}
}
