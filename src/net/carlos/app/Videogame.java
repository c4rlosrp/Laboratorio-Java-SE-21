package net.carlos.app;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author manana
 **/
public class Videogame implements Comparable<Videogame> {

    private String title, autor;
    private Genre genre;
    private int espacio;
    private LocalDate fecha;
    private double ranking;

    public Videogame(String title, String autor, Genre genre, int espacio, LocalDate fecha, double ranking) {
        this.title = title;
        this.autor = autor;
        this.genre = genre;
        this.espacio = espacio;
        this.fecha = fecha;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", genre=" + genre +
                ", espacio=" + espacio +
                ", fecha=" + fecha +
                ", ranking=" + ranking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o instanceof Videogame videogame)
            return Objects.equals(title, videogame.title) && Objects.equals(autor, videogame.autor) && genre == videogame.genre && Objects.equals(fecha, videogame.fecha);
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, genre, fecha);
    }

    @Override
    public int compareTo(Videogame o) {
        return (this.getTitle().compareTo(o.getTitle()) == 0) ?
             (this.getAutor().compareTo(o.getAutor()) != 0) ?
                    this.getAutor().compareTo(o.getAutor()) :
                    this.getFecha().getYear() - o.getFecha().getYear() :
                this.getTitle().compareTo(o.getTitle());
    }
}
