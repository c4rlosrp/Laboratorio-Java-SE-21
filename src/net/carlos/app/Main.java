package net.carlos.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author manana
 **/
public class Main {

    static List<Videogame> videogameList = new ArrayList<>();
    static Set<Videogame> videogameSet = new HashSet<>();

    public static void main(String[] args) {
        Videogame v1 = new Videogame("Cyberpunk 2077", "Red CD Project", Genre.RPG, 60, LocalDate.of(2020, 10, 12), 7.8);

//        catalog.forEach(System.out::println);
//        videogameList.stream()
//                .limit(10)
//                .forEach(videogame -> System.out.println(videogame.getTitle()));

        videogameSet.add(v1);
        videogameSet.add(v1);
        videogameSet.stream()
                .forEach(videogame -> System.out.println(videogame.getTitle() + " " + videogame.hashCode()));
    }

    static {
        Videogame v1 = new Videogame("Cyberpunk 2077", "Red CD Project", Genre.RPG, 60, LocalDate.of(2020, 10, 12), 7.8);
        Videogame v2 = new Videogame("Captain Tsubasa: World Fighters", "Bandai", Genre.FOOTBALL, 50, LocalDate.of(2026, 8, 20), 6.7);
        Videogame v3 = new Videogame("Castlevania Belmont Curse", "KONAMI", Genre.METROIDVANIA, 28, LocalDate.of(2026, 10, 19), 8.1);
        Videogame v4 = new Videogame("Inazuma eleven Go", "Level5", Genre.FOOTBALL, 3, LocalDate.of(2012, 7, 14), 8.3);
        Videogame v5 = new Videogame("Devil May Cry", "Capcom", Genre.HACK_AND_SLASH, 7, LocalDate.of(2002, 4, 17), 7.9);
        Videogame v6 = new Videogame("Devil May Cry 3", "Capcom", Genre.HACK_AND_SLASH, 12, LocalDate.of(2005, 2, 4), 8.4);
        Videogame v7 = new Videogame("Devil May Cry 5", "Capcom", Genre.HACK_AND_SLASH, 33, LocalDate.of(2018, 8, 21), 8.7);
        Videogame v8 = new Videogame("Super Mario Odyssey", "Nintendo", Genre.PLATFORMS, 25, LocalDate.of(2018, 9, 5), 9);
        Videogame v9 = new Videogame("Metaphor", "Atlus", Genre.RPG, 41, LocalDate.of(2024, 3, 14), 7.8);

        // Roguelike
        Videogame v10 = new Videogame("Hades", "Supergiant Games", Genre.ROGUELIKE, 15, LocalDate.of(2020, 9, 17), 9.3);
        Videogame v11 = new Videogame("The Binding of Isaac: Rebirth", "Nicalis", Genre.ROGUELIKE, 1, LocalDate.of(2014, 11, 4), 8.6);
        Videogame v12 = new Videogame("Dead Cells", "Motion Twin", Genre.ROGUELIKE, 1, LocalDate.of(2018, 8, 7), 8.2);
        Videogame v13 = new Videogame("Slay the Spire", "Mega Crit", Genre.ROGUELIKE, 1, LocalDate.of(2019, 1, 23), 8.9);
        Videogame v14 = new Videogame("Enter the Gungeon", "Dodge Roll", Genre.ROGUELIKE, 3, LocalDate.of(2016, 4, 5), 7.4);
        Videogame v15 = new Videogame("Returnal", "Housemarque", Genre.ROGUELIKE, 60, LocalDate.of(2021, 4, 30), 7.1);
        Videogame v16 = new Videogame("Risk of Rain 2", "Hopoo Games", Genre.ROGUELIKE, 4, LocalDate.of(2020, 8, 11), 6.8);
        Videogame v17 = new Videogame("Hades II", "Supergiant Games", Genre.ROGUELIKE, 20, LocalDate.of(2025, 9, 25), 9.1);

        // Hack and Slash
        Videogame v18 = new Videogame("Bayonetta", "PlatinumGames", Genre.HACK_AND_SLASH, 9, LocalDate.of(2009, 10, 29), 8.5);
        Videogame v19 = new Videogame("God of War", "Santa Monica Studio", Genre.HACK_AND_SLASH, 45, LocalDate.of(2018, 4, 20), 9.4);
        Videogame v20 = new Videogame("Metal Gear Rising: Revengeance", "PlatinumGames", Genre.HACK_AND_SLASH, 25, LocalDate.of(2013, 2, 19), 7.6);
        Videogame v21 = new Videogame("Ninja Gaiden II", "Team Ninja", Genre.HACK_AND_SLASH, 7, LocalDate.of(2008, 6, 3), 6.2);
        Videogame v22 = new Videogame("Diablo IV", "Blizzard Entertainment", Genre.HACK_AND_SLASH, 90, LocalDate.of(2023, 6, 6), 5.4);
        Videogame v23 = new Videogame("Dynasty Warriors 9", "Omega Force", Genre.HACK_AND_SLASH, 40, LocalDate.of(2018, 2, 8), 3.2);
        Videogame v24 = new Videogame("Bayonetta 3", "PlatinumGames", Genre.HACK_AND_SLASH, 15, LocalDate.of(2022, 10, 28), 7.0);

        // Metroidvania
        Videogame v25 = new Videogame("Hollow Knight", "Team Cherry", Genre.METROIDVANIA, 9, LocalDate.of(2017, 2, 24), 9.5);
        Videogame v26 = new Videogame("Castlevania: Symphony of the Night", "Konami", Genre.METROIDVANIA, 1, LocalDate.of(1997, 3, 20), 9.2);
        Videogame v27 = new Videogame("Metroid Dread", "MercurySteam", Genre.METROIDVANIA, 4, LocalDate.of(2021, 10, 8), 8.7);
        Videogame v28 = new Videogame("Ori and the Blind Forest", "Moon Studios", Genre.METROIDVANIA, 11, LocalDate.of(2015, 3, 11), 8.1);
        Videogame v29 = new Videogame("Ori and the Will of the Wisps", "Moon Studios", Genre.METROIDVANIA, 20, LocalDate.of(2020, 3, 11), 8.8);
        Videogame v30 = new Videogame("Blasphemous", "The Game Kitchen", Genre.METROIDVANIA, 5, LocalDate.of(2019, 9, 10), 7.3);
        Videogame v31 = new Videogame("Hollow Knight: Silksong", "Team Cherry", Genre.METROIDVANIA, 8, LocalDate.of(2025, 9, 4), 8.9);
        Videogame v32 = new Videogame("Bloodstained: Ritual of the Night", "ArtPlay", Genre.METROIDVANIA, 10, LocalDate.of(2019, 6, 18), 6.5);

        // Arcade
        Videogame v33 = new Videogame("Pac-Man", "Namco", Genre.ARCADE, 1, LocalDate.of(1980, 5, 22), 7.7);
        Videogame v34 = new Videogame("Street Fighter II", "Capcom", Genre.ARCADE, 1, LocalDate.of(1991, 2, 6), 8.4);
        Videogame v35 = new Videogame("Space Invaders", "Taito", Genre.ARCADE, 1, LocalDate.of(1978, 6, 1), 6.9);
        Videogame v36 = new Videogame("Galaga", "Namco", Genre.ARCADE, 1, LocalDate.of(1981, 9, 1), 5.8);
        Videogame v37 = new Videogame("Metal Slug", "SNK", Genre.ARCADE, 1, LocalDate.of(1996, 4, 19), 8.0);
        Videogame v38 = new Videogame("Tetris Effect", "Resonair", Genre.ARCADE, 4, LocalDate.of(2018, 11, 9), 4.6);
        Videogame v39 = new Videogame("Pac-Man 99", "Namco", Genre.ARCADE, 1, LocalDate.of(2021, 4, 7), 2.9);

        // Football
        Videogame v40 = new Videogame("EA Sports FC 25", "EA Sports", Genre.FOOTBALL, 50, LocalDate.of(2024, 9, 27), 4.1);
        Videogame v41 = new Videogame("FIFA 23", "EA Sports", Genre.FOOTBALL, 50, LocalDate.of(2022, 9, 30), 3.8);
        Videogame v42 = new Videogame("Pro Evolution Soccer 6", "Konami", Genre.FOOTBALL, 4, LocalDate.of(2006, 10, 26), 9.0);
        Videogame v43 = new Videogame("eFootball 2022", "Konami", Genre.FOOTBALL, 50, LocalDate.of(2021, 9, 30), 1.2);
        Videogame v44 = new Videogame("Mario Strikers: Battle League", "Next Level Games", Genre.FOOTBALL, 3, LocalDate.of(2022, 6, 10), 5.0);
        Videogame v45 = new Videogame("Rocket League", "Psyonix", Genre.FOOTBALL, 25, LocalDate.of(2015, 7, 7), 8.3);
        Videogame v46 = new Videogame("Inazuma Eleven: Victory Road", "Level-5", Genre.FOOTBALL, 20, LocalDate.of(2025, 11, 13), 7.2);
        Videogame v47 = new Videogame("Football Manager 2024", "Sports Interactive", Genre.FOOTBALL, 8, LocalDate.of(2023, 11, 6), 7.9);

        // RPG
        Videogame v48 = new Videogame("The Witcher 3: Wild Hunt", "CD Projekt Red", Genre.RPG, 50, LocalDate.of(2015, 5, 19), 9.6);
        Videogame v49 = new Videogame("Elden Ring", "FromSoftware", Genre.RPG, 60, LocalDate.of(2022, 2, 25), 9.4);
        Videogame v50 = new Videogame("Final Fantasy VII", "Square", Genre.RPG, 2, LocalDate.of(1997, 1, 31), 9.0);
        Videogame v51 = new Videogame("Persona 5 Royal", "Atlus", Genre.RPG, 41, LocalDate.of(2019, 10, 31), 9.1);
        Videogame v52 = new Videogame("Baldur's Gate 3", "Larian Studios", Genre.RPG, 150, LocalDate.of(2023, 8, 3), 9.7);
        Videogame v53 = new Videogame("Starfield", "Bethesda Game Studios", Genre.RPG, 125, LocalDate.of(2023, 9, 6), 5.9);
        Videogame v54 = new Videogame("Mass Effect: Andromeda", "BioWare", Genre.RPG, 55, LocalDate.of(2017, 3, 21), 4.4);

        // Plataformas
        Videogame v55 = new Videogame("Celeste", "Maddy Makes Games", Genre.PLATFORMS, 1, LocalDate.of(2018, 1, 25), 9.2);
        Videogame v56 = new Videogame("Super Mario Bros. Wonder", "Nintendo", Genre.PLATFORMS, 5, LocalDate.of(2023, 10, 20), 8.8);
        Videogame v57 = new Videogame("Crash Bandicoot 4: It's About Time", "Toys for Bob", Genre.PLATFORMS, 30, LocalDate.of(2020, 10, 2), 7.5);
        Videogame v58 = new Videogame("Sonic Forces", "Sonic Team", Genre.PLATFORMS, 15, LocalDate.of(2017, 11, 7), 4.8);
        Videogame v59 = new Videogame("Astro Bot", "Team Asobi", Genre.PLATFORMS, 45, LocalDate.of(2024, 9, 6), 9.3);
        Videogame v60 = new Videogame("Bubsy 3D", "Eidetic", Genre.PLATFORMS, 1, LocalDate.of(1996, 11, 25), 0.8);
        Videogame v61 = new Videogame("Rayman Legends", "Ubisoft Montpellier", Genre.PLATFORMS, 11, LocalDate.of(2013, 8, 29), 8.6);

        videogameList = List.of(
                v1, v2, v3, v4, v5, v6, v7, v8, v9, v10,
                v11, v12, v13, v14, v15, v16, v17, v18, v19, v20,
                v21, v22, v23, v24, v25, v26, v27, v28, v29, v30,
                v31, v32, v33, v34, v35, v36, v37, v38, v39, v40,
                v41, v42, v43, v44, v45, v46, v47, v48, v49, v50,
                v51, v52, v53, v54, v55, v56, v57, v58, v59, v60,
                v61
        );

        videogameSet.addAll(Set.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10));

    }

}