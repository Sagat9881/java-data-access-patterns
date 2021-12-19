package ru.apzakharov.locales;

import com.ibm.icu.text.Transliterator;
import lombok.NoArgsConstructor;
import ru.apzakharov.Book;
import ru.apzakharov.Locale;

@NoArgsConstructor
public class US implements Locale {

    @Override
    public Book localize(Book book) {
        String bookLocaleString = book.getLocale().getClass().getSimpleName();

        switch (bookLocaleString) {
            case "US":
                book.setLocale(this); return book;
            case "RU":
                book.setLocale(this);  return localizeFromRU(book);
            case "EUR":
                book.setLocale(this);  return localizeFromEUR(book);

        }
        return book;
    }

    private Book localizeFromRU(Book book) {
        String CYRILLIC_TO_LATIN = "Cyrillic-Latin";

        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");
        String priceRU = book.getPrice().replaceAll(nanPartOfPrice,"");
        String nameRU = book.getName();
        String authorRU = book.getAuthor();

        Transliterator transliterator = Transliterator.getInstance(CYRILLIC_TO_LATIN);

        book.setPrice("US "+Double.parseDouble(priceRU)*0.013);
        book.setName(transliterator.transliterate(nameRU));
        book.setAuthor(transliterator.transliterate(authorRU));

        return book;
    }

    private Book localizeFromEUR(Book book) {

        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");
        String priceEUR = book.getPrice().replaceAll(nanPartOfPrice,"");
        book.setPrice( "US "+Double.parseDouble(priceEUR)*1.12);
        return book;
    }
}
