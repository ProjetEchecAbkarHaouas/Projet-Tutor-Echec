package fr.raiyajin.jeu;
import fr.raiyajin.projet_echec.*;
import java.util.*;


public class Joueur {
	private String nom;	//nom du joueur
	
	public Joueur(String nom) { //Constructeur par défaut
		this.nom = nom;
	}
	
	public Joueur() { //Constructeur vide pour la méthode init
		this.init();
		
	}
	
	public String getNom() { //récupère le nom du joueur
		return this.nom;
	}
	
	public void setNom(String nom) { //modifie le nom du joueur
		this.nom = nom;
	}
	
	public void init() { //méthode pour permettre au joueur de se nommer

		System.out.println("Entrez le nom du joueur");
		Scanner nom_joueur = new Scanner(System.in);
		this.setNom(nom_joueur.nextLine());

		
		
	}
}
