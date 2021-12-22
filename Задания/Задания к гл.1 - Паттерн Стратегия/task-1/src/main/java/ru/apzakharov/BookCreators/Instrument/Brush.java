package ru.apzakharov.BookCreators.Instrument;

import ru.apzakharov.Book;
import ru.apzakharov.BookCreators.BookCreator;

public class Brush implements BookCreator {

    private static String BRUSH_STRING ="“Brush paint the book";

    @Override
    public Book doBook(Book book) {
        book.setPaints(BRUSH_STRING);
        return book;
    }
}
