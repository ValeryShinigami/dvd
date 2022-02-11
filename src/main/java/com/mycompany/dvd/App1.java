package com.mycompany.dvd;

import com.mycompany.controller.DefaultFilmController;


public class App1 
{
    public static void main( String[] args )
    {
    	//on instancie le controller et on fait appel à sa méthode
    	
    	DefaultFilmController dfc = new DefaultFilmController();
    	dfc.registerFilmFromConsoleInput();
    }
}
