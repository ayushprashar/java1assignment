package edu.knoldus.utilities;

import java.util.stream.Stream;

public class Movie {
    private String name ;
    private int releaseYear;
    private int rating;
    private String genre;

    public Movie(String name,int releaseYear,int rating,String genre){
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
    }

    public String getName(){
        return name;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getRating(){
        return rating;
    }
    public String getGenre(){
        return genre;
    }

    @Override
    public String toString() {
        return ("Name " + name + "release year " + releaseYear + "Rating " + rating + " genre" + genre);
    }
}
