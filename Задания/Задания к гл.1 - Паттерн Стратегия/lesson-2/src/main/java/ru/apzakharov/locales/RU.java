package ru.apzakharov.locales;

import com.ibm.icu.text.Transliterator;
import lombok.NoArgsConstructor;
import ru.apzakharov.Book;
import ru.apzakharov.Locale;
@NoArgsConstructor
public class RU implements Locale {
    @Override
    public Book localize(Book book) {
        String bookLocaleString = book.getLocale().getClass().getSimpleName();

        switch (bookLocaleString) {
            case "US":
                book.setLocale(this);   return localizeFromUS(book);
            case "RU":
                book.setLocale(this);     return book;
            case "EUR":
                book.setLocale(this);    return localizeFromEUR(book);

        }
        return book;
    }

    private Book localizeFromUS(Book book) {
        String CYRILLIC_TO_LATIN = "Latin-Cyrillic";

        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");
        String priceUS = book.getPrice().replaceAll(nanPartOfPrice,"");
        String nameUS = book.getName();
        String authorUS = book.getAuthor();

        Transliterator transliterator = Transliterator.getInstance(CYRILLIC_TO_LATIN);

        book.setPrice( "РУБ "+Double.parseDouble(priceUS)*74.1);
        book.setName( transliterator.transliterate(nameUS));
        book.setAuthor( transliterator.transliterate(authorUS));



        return book;
    }

    private Book localizeFromEUR(Book book) {
        String CYRILLIC_TO_LATIN = "Latin-Cyrillic";

        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");
        String priceEUR = book.getPrice().replaceAll(nanPartOfPrice,"");
        String nameEUR = book.getName();
        String authorEUR = book.getAuthor();

        Transliterator transliterator = Transliterator.getInstance(CYRILLIC_TO_LATIN);

        book.setPrice("РУБ "+Double.parseDouble(priceEUR)*83.28);
        book.setName( transliterator.transliterate(nameEUR));
        book.setAuthor( transliterator.transliterate(authorEUR));

        return book;
    }

}
