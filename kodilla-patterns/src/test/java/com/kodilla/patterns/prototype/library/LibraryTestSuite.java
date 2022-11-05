package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){

        //given
        //creating the first Library
        Library library = new Library("TheOne");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("King Arthur "+n,
                                                    "J. R. R. Tolkien",
                                                    LocalDate.of(1962+n, n*2, 7+n*3-n*2))));

        //making a shallow copy of object library
        Library swallowCopy = null;
        try {
            swallowCopy = library.shallowCopy();
            swallowCopy.setName("Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When - cleaning Library
        library.getBooks().clear();


        //Then
        System.out.println(library);
        System.out.println(swallowCopy);
        System.out.println(deepCopy);
        assertEquals(0, library.getBooks().size());
        assertEquals(0, swallowCopy.getBooks().size());
        assertEquals(5, deepCopy.getBooks().size());
        assertEquals(swallowCopy.getBooks(), library.getBooks());
        assertNotEquals(deepCopy.getBooks(), library.getBooks());












    }
}
