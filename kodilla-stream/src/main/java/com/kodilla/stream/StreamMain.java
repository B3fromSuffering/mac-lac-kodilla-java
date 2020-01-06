package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;


public class StreamMain {
    public static void main(String[] args) {

        // Zadanie: funkcyjny spacer po liscie uzytkownikow forum
       /* LocalDate today = LocalDate.now();
        LocalDate twentyYearsAgo = today.minusYears(20);
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(twentyYearsAgo))
                .filter(forumUser -> forumUser.getPostsNumber() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println(theResultMapOfForumUser);*/
        LocalDate firstDate = LocalDate.now().minusDays(10);
        LocalDate secondDate = LocalDate.now();
        System.out.println(firstDate);
        System.out.println(LocalDate.now());
        System.out.println(DAYS.between(firstDate, secondDate));
        double lll = DAYS.between(firstDate, secondDate);
    }


}