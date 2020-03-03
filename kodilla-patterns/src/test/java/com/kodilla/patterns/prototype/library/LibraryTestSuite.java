package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testToString() {
        //Given
        Book book1 = new Book("ksiega", "Adam Adam", LocalDate.of(2000,02,01));
        Book book2 = new Book("zielone witaminy", "Janina Adam", LocalDate.of(1999,02,01));
        Book book3 = new Book("zza krzaka", "Adam Janina", LocalDate.of(1888,02,01));
        Book book4 = new Book("kamieni kupa", "Piotr Adam", LocalDate.of(1000,02,01));
        Book book5 = new Book("do okoła", "Adam Paweł", LocalDate.of(2002,02,01));
        Library library = new Library("Biblioteka świętego wacława");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Zupełnie inna biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Totalnie już inna biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks().size(), library.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks().size(), library.getBooks().size());
    }
}
