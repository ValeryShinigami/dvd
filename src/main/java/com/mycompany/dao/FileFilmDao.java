package com.mycompany.dao;

import java.io.FileWriter;

import com.mycompany.entity.Film;

public class FileFilmDao {
	
	//Méthode save pour sauvegardé l'entité métier 
	public void save(Film film) {
		
		//utilisation de la classe FileWriter pour insérer les données dans un fichier
		FileWriter writer;
		try {
			
			writer =  new FileWriter("/Users/valerykalombo/Desktop/film.txt", true);
			writer.write("Titre: "+film.getTitre()+" Genre: "+film.getGenre()+" Nbre Exemplaires "+film.getNbExemplaires()+"\n");
			writer.close();
			
		} catch (Exception e) {
			
		}
		
	}

}

