package com.solid.book;

import java.util.List;

public class ReadableBook extends AbstractBook implements Readable {
    public ReadableBook(String title, List<String> pages) {
        super(title, pages);
    }

    @Override
    public void printToScreen() {
        ReadableBook book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }


}
