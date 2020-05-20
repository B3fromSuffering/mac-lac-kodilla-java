package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(new Book("Michael Jackson", "Auć!", 1990, "1234561"));
        bookSet.add(new Book("John Maynard Keyns", "how to print money", 1900, "1239994"));
        bookSet.add(new Book("Timoty Leary", "you should try LSD", 1965, "696969696"));
        bookSet.add(new Book("John Snow", "I know nothing", 1000, "000001"));
        bookSet.add(new Book("Bill Gates", "this vaccine will save you", 2020, "2020"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(median, 1965);
    }
}
