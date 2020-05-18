package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumUserTestSuit {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone, could you help me with for loop?");
        javaHelpForum.addPost("better try to use thile loop in this case");
        javaToolsForum.addPost("help plzm my MySQL db doesnt watt to work");
        javaHelpForum.addPost("why while? is it better?");
        javaToolsForum.addPost("when i try to log in i got 'bad credentials' message qq ;(");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
