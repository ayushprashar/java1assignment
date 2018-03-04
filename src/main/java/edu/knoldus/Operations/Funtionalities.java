package edu.knoldus.Operations;

import edu.knoldus.utilities.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Funtionalities {
    /*    public List<Word> getWordsInASentence(String sentence) {
     *//*    String[] words = sentence.split(" ");
        return (Arrays.stream(words)
                .map(ch -> new Word(ch,1))
                .collect(Collectors.groupingBy(obj -> obj.myWord)));*//*
     *//*        Map<String,Integer> wordCount = new HashMap<String, Integer>();
        for (String word : words) {
            if(wordCount.containsKey(word))
                wordCount.put(word,wordCount.get(word)+1);
            else
                wordCount.put(word,1);
        }
        ArrayList<Word> result = new ArrayList<>();
        wordCount.forEach((x,y) -> {
            Word keyValue = new Word(x, y);
            result.add(keyValue);
        });
        return result;*//*
    }*/
    private boolean primeCheck(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int counter = 2; counter < num / 2; counter++) {
            if (num % counter == 0)
                return false;
        }
        return true;
    }

    public Stream<Integer> primeListBuilder(List<Integer> domain) {
        return (domain.stream()
                .filter(this::primeCheck));
    }

    public Map<String, Integer> wordCounter(String filePath) {
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        try (Stream<String> line = Files.lines(Paths.get(filePath))) {
            line.forEach(sentence -> {
                String[] words = sentence.split(" ");
                for (String word : words) {
                    if (wordCount.containsKey(word))
                        wordCount.put(word, wordCount.get(word) + 1);
                    else
                        wordCount.put(word, 1);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public Stream<Integer> multiplyLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> first = list1.stream().iterator();
        Iterator<Integer> second = list2.stream().iterator();
        ArrayList<Integer> result = new ArrayList<>();
        while (first.hasNext() && second.hasNext())
            result.add(first.next() * second.next());
        return result.stream();
    }

    public List<Movie> getMovieByRatingAndGenre(int rating, String genre, List<Movie> movies) {
        return (movies.stream()
                .filter(film -> film.getGenre().equals(genre) && film.getRating() > rating))
                .collect(Collectors.toList());
    }

    public List<Movie> getMovieByRYandRating(int year, int rating, List<Movie> movies) {
        return (movies.stream().filter(
                film -> film.getReleaseYear() > year && film.getRating() < rating
        )
                .collect(Collectors.toList()));
    }

    public List<Movie> getEvenRating(List<Movie> movies) {
        return (
                movies.stream().filter(film -> film.getRating() % 2 == 0)
                        .collect(Collectors.toList())
        );
    }

    public List<Movie> getByGenreAndRating(String genre, int rating, List<Movie> movies) {
        return (
                movies.stream().filter(film -> film.getRating() == rating && film.getGenre().equals(genre))
                        .collect(Collectors.toList())
        );
    }
}
