package com.solid.book;

import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Readable book = new ReadableBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
