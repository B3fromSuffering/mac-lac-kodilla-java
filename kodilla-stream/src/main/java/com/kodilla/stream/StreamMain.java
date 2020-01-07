package com.kodilla.stream;

import java.time.LocalDate;

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