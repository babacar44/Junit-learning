package com.bookstoread;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

@DisplayName("<= BookShelf Specification =>")
public class BookShelfSpec {

    private BookShelfSpec(TestInfo testInfo) {
        System.out.println("Working on test "+ testInfo.getDisplayName());
    }
    @Test
    public void shelf_empty_when_no_book_added() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }

    @Test
    @DisplayName("is empty when no book is added to it")
    void clayette_empty_when_no_book_added(TestInfo testInfo) {
        System.out.println("Working on test case" + testInfo.getDisplayName());
        BookShelf bookShelf = new BookShelf();
        List<String> books = bookShelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty");
    }

    @Test
    void shelfToStringShouldPrintBookCountAndTitles() throws Exception {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        books.add("The Phoenix Project");
        books.add("Java 8 in Action");
        String shelfStr = books.toString();
        assertAll(() -> assertTrue(shelfStr.contains("The Phoenix Project"),"1st book title missing"),
                () -> assertTrue(shelfStr.contains("Java 8 in Action"), "2nd book title missing "),
                () -> assertTrue(shelfStr.contains("2 books found"), "Book  count missing")
        );
    }
}
