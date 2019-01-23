package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Public library");
        Book book1 = new Book("tytuł1", "autor1", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("tytuł2", "autor2", LocalDate.of(2000, 1, 1));
        Book book3 = new Book("tytuł3", "autor3", LocalDate.of(2000, 1, 1));
        Book book4 = new Book("tytuł4", "autor4", LocalDate.of(2000, 1, 1));
        Book book5 = new Book("tytuł5", "autor5", LocalDate.of(2000, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Public Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Cloned Public Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //While
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
