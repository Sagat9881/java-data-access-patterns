package ru.apzakharov.BookCreators.Instrument;

import ru.apzakharov.Book;
import ru.apzakharov.BookCreators.BookCreator;

public class Pen implements BookCreator {

    private static String PEN_STRING ="write pen the book";

    @Override
    public Book doBook(Book book) {
        book.setWords(PEN_STRING);

        return book;
    }
}
