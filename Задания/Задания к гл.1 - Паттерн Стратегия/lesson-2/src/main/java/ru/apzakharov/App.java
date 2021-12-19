package ru.apzakharov;

import ru.apzakharov.locales.EUR;
import ru.apzakharov.locales.RU;
import ru.apzakharov.locales.US;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Book book = new Book();
        book.setAuthor("Alexander");
        book.setName("java-access-patterns");
        book.setNumberOfPages(666L);
        book.setPrice("US 45.0");
        book.setLocale(new US());

        System.out.println(book.getAllInfoByMap(new RU()).toString());
        System.out.println(book.getAllInfoByMap(new EUR()).toString());
        System.out.println(book.getAllInfoByMap(new US()).toString());
    }
}
