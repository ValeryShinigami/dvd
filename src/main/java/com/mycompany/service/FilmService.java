package com.mycompany.service;

import com.mycompany.dao.FileFilmDao;
import com.mycompany.entity.Film;

public class FilmService  {
	

	public void registerFilm(Film film) {
		
		FileFilmDao ffd = new FileFilmDao();
		ffd.save(film);
		
	}



}
