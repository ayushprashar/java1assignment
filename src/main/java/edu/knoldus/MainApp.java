package edu.knoldus;

import edu.knoldus.Operations.Funtionalities;
import edu.knoldus.utilities.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Funtionalities check = new Funtionalities();

        ArrayList<Integer> list = new ArrayList<>();

        Random randomGenrator = new Random();

        for (int count = 0; count < 20; count++)
            list.add(randomGenrator.nextInt(100));
        String filepath = "src/main/resources/countMeIn";
        System.out.println(list);
        check.primeListBuilder(list).forEach(System.out::println);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int count = 0; count < 20; count++)
            list2.add(randomGenrator.nextInt(100));

        check.multiplyLists(list, list2).forEach(System.out::println);
        System.out.println(check.wordCounter(filepath));
        Movie movie1 = new Movie("ABC", 2003, 7, "comedy");
        Movie movie2 = new Movie("bcd", 2009, 9, "romance");
        Movie movie3 = new Movie("teesri", 2008, 10, "comedy");
        Movie movie5 = new Movie("5vi", 1998, 9, "comedy");
        Movie movie4 = new Movie("4thi", 1998, 6, "sci-fi");
        Movie movie6 = new Movie("7th", 2008, 7, "sci-fi");
        List<Movie> db = new ArrayList<Movie>();
        db.add(movie1);
        db.add(movie2);
        db.add(movie3);
        db.add(movie4);
        db.add(movie5);
        db.add(movie6);
        check.getMovieByRatingAndGenre(8, "comedy", db).forEach(System.out::println);
        check.getMovieByRYandRating(2000, 8, db).forEach(System.out::println);
        check.getEvenRating(db).forEach(System.out::println);
        check.getByGenreAndRating("sci-fi", 7, db).forEach(System.out::println);

    }
}
