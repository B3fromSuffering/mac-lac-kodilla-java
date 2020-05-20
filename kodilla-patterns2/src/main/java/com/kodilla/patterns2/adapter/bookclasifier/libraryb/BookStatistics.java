package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePPPublicationYear(Map<BookSignature, Book> books);
    int medianPPPublicationYear(Map<BookSignature, Book> books);
}
