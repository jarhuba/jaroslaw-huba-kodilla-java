package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Andrzej Sapkowski", "Wiedźmin", 1990, "1"));
        books.add(new Book("Andrzej Sapkowski", "Ostatnie życzenie", 1993, "2"));
        books.add(new Book("Andrzej Sapkowski", "Miecz przeznaczenia", 1993, "3"));
        books.add(new Book("Andrzej Sapkowski", "Coś się kończy, coś się zaczyna", 2000, "4"));
        books.add(new Book("Andrzej Sapkowski", "Opowieści o wiedźminie, tom 1", 2002, "5"));
        books.add(new Book("Andrzej Sapkowski", "Krew elfów", 1994, "6"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(1994, median, 0);
    }
}
