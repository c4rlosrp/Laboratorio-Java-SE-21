package net.carlos.app;

import java.time.LocalDate;
import java.util.List;

/**
 * @author manana
 **/
public class Main {

    private static List<Videogame> catalogo;

    public static void main(String[] args) {



    }

    static {
        Videogame v1 = new Videogame("Cyberpunk 2077", "Red CD Project", Genre.RPG, 60, LocalDate.of(2020,10, 12),7.8);
        Videogame v2 = new Videogame("Captain Tsubasa: World Fighters", "Bandai", Genre.football, 50, LocalDate.of(2026,8, 20),6.7);
        Videogame v3 = new Videogame("Castlevania Belmont Curse", "KONAMI", Genre.metroidvania, 28, LocalDate.of(2026,10, 19),8.1);
        Videogame v4 = new Videogame("Inazuma eleven Go", "Level5", Genre.football, 3, LocalDate.of(2012,7, 14),8.3);
        Videogame v5 = new Videogame("Devil May Cry", "Capcom", Genre.hackAndSlash, 7, LocalDate.of(2002,4, 17),7.9);
        Videogame v6 = new Videogame("Devil May Cry 3", "Capcom", Genre.hackAndSlash, 12, LocalDate.of(2005,2, 4),8.4);
        Videogame v7 = new Videogame("Devil May Cry 5", "Capcom", Genre.hackAndSlash, 33, LocalDate.of(2018,8, 21),8.7);
        Videogame v8 = new Videogame("Super Mario Odyssey", "Nintendo", Genre.platforms, 25, LocalDate.of(2018,9, 5),9);
        Videogame v9 = new Videogame("Metaphor", "Atlus", Genre.RPG, 41, LocalDate.of(2024,3, 14),7.8);


    }

}