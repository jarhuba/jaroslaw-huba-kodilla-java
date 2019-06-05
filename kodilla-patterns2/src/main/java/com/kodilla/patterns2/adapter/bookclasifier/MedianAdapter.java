package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book b : bookSet) {
            books.put(new BookSignature(b.getSignature()), new Book(b.getAuthor(), b.getTitle(), b.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
