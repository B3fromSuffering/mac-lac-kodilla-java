package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;


public class StreamMovieStore {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String allMovies = movieStore.getMovies().entrySet().stream()
                .map(s -> s.getValue())
                .map(s -> s.get(1))
                .collect(Collectors.joining("!"));

        System.out.println(allMovies);
    }
}
