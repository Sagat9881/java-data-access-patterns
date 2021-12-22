package ru.apzakharov.locales;

import ru.apzakharov.Locale;

public class LocaleFactory {

    public static Locale getLocale(Class<? extends Locale> localeClass) throws Exception{
        return localeClass.newInstance();
    }

}
