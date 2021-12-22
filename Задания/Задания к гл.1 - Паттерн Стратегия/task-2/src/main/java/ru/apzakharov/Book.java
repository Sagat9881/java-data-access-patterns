package ru.apzakharov;

import lombok.*;
import ru.apzakharov.locales.LocaleFactory;

import java.util.HashMap;
import java.util.Map;



@NoArgsConstructor
@Getter
@Setter
public class Book {

    private  String price;
    private  String name;
    private  String author;
    private  Long NumberOfPages;

    private  Locale locale;

    public  String getPriceLocal(Locale locale) throws Exception {
        return LocaleFactory
                .getLocale(locale.getClass())
                .localize(this)
                .getPrice();
    }

    public String getNameLocal(Locale locale) throws Exception {
        return LocaleFactory
                .getLocale(locale.getClass())
                .localize(this)
                .getName();
    }

    public String getAuthorLocal(Locale locale) throws Exception {
        return LocaleFactory
                .getLocale(locale.getClass())
                .localize(this)
                .getAuthor();
    }

    public Map<String,Object> getAllInfoByMap(Locale locale) throws Exception{

        Map<String,Object> bookMap = new HashMap<>();

        bookMap.put("name",this.getNameLocal(locale));
        bookMap.put("author",this.getAuthorLocal(locale));
        bookMap.put("price",this.getPriceLocal(locale));
        bookMap.put("numberOfPage",this.getNumberOfPages());

        return bookMap;

    }

}
