package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(0001, "Anonim",
                'M', LocalDate.of(1990,10,10), 0));
        theForumUserList.add(new ForumUser(0002, "Oxygen",
                'M', LocalDate.of(1995,10,10), 12));
        theForumUserList.add(new ForumUser(0003, "Dezox",
        'F', LocalDate.of(1985,10,10), 120));
        theForumUserList.add(new ForumUser(0004, "Indy",
                'M', LocalDate.of(1989,11,10), 34));
        theForumUserList.add(new ForumUser(0005, "Jogi",
                'M', LocalDate.of(2005,10,10), 80));
        theForumUserList.add(new ForumUser(0006, "Beata",
                'F', LocalDate.of(2008,10,10), 90));
        theForumUserList.add(new ForumUser(0007, "Greg",
                'M', LocalDate.of(1984,10,10), 66));
        theForumUserList.add(new ForumUser(0010, "Mati",
                'F', LocalDate.of(1987,10,10), 4));
        theForumUserList.add(new ForumUser(0011, "Lena",
                'M', LocalDate.of(1978,10,10), 8));
        theForumUserList.add(new ForumUser(0012, "Warlord",
                'M', LocalDate.of(1999,10,10), 0));
    }

    public List<ForumUser> getList() {
        return theForumUserList;
    }
}
