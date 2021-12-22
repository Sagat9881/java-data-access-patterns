package ru.apzakharov;

import ru.apzakharov.BookCreators.Artist;
import ru.apzakharov.BookCreators.Writer;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        List<PublishWorker> publishWorkerList = new ArrayList<>();

        publishWorkerList.add(new Artist());
        publishWorkerList.add(new Writer());

        PublishingOffice.hireAll(publishWorkerList);

        Book book = PublishingOffice.publishBook();

    }
}
