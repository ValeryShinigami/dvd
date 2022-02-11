package com.mycompany.controller;

import java.util.Scanner;

import com.mycompany.entity.Film;
import com.mycompany.service.FilmService;

public class DefaultFilmController {

	//Création de la méthode pour récuperer film genre nbExemplaire dynamiquement
	public void registerFilmFromConsoleInput() {

		//On scanne l'entrée
		Scanner sc = new Scanner(System.in);
		//On récupère le titre
		System.out.println("Quel est le titre ?");
		String titre = sc.nextLine();
		//On récupère le genre
		System.out.println("Quel est le genre ?");
		String genre = sc.nextLine();
		//On récupère le nbExemplaires
		System.out.println("Quel est le nombre d'exemplaire ?");
		int nbExemplaires = sc.nextInt();
		
		//instanciation de film
        Film film = new Film();
        film.setTitre(titre);
        film.setGenre(genre);
        film.setNbExemplaires(nbExemplaires);
        
        FilmService service = new FilmService();
        service.registerFilm(film);
        
        System.out.println("Film ajouté avec succès");
	}

}
