package ru.apzakharov.locales;

import com.ibm.icu.text.Transliterator;
import lombok.NoArgsConstructor;
import ru.apzakharov.Book;
import ru.apzakharov.Locale;

@NoArgsConstructor
public class EUR implements Locale {
    @Override
    public Book localize(Book book) {
        String bookLocaleString = book.getLocale().getClass().getSimpleName();

        switch (bookLocaleString) {
            case "US":
                book.setLocale(this); return localizeFromUS(book);
            case "RU":
                book.setLocale(this); return localizeFromRU(book);
            case "EUR":
                book.setLocale(this); return book;

        }

        book.setLocale(this);
        return book;
    }

    private Book localizeFromRU(Book book) {
        String CYRILLIC_TO_LATIN = "Cyrillic-Latin";

        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");;
        String priceRU = book.getPrice().replaceAll(nanPartOfPrice,"");
        String nameRU = book.getName();
        String authorRU = book.getAuthor();

        Transliterator transliterator = Transliterator.getInstance(CYRILLIC_TO_LATIN);

        book.setPrice( "EUR"+Double.parseDouble(priceRU)*0.012);
        book.setName( transliterator.transliterate(nameRU));
        book.setAuthor( transliterator.transliterate(authorRU));

        return book;
    }

    private Book localizeFromUS(Book book) {
        String nanPartOfPrice = book.getPrice().replaceAll("(0|[1-9]\\d*)(\\.\\d+)?$","");;
        String priceUS = book.getPrice().replaceAll(nanPartOfPrice,"");
        book.setPrice("EUR "+Double.parseDouble(priceUS)*0.89);
        return book;
    }
}
