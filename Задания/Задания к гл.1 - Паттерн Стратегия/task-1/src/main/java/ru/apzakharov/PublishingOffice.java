package ru.apzakharov;

import java.util.ArrayList;
import java.util.List;

public class PublishingOffice {
    private static List<PublishWorker> publishers = new ArrayList<>();

    public static void hire(PublishWorker newPublisher) {
        System.out.println("Hire new Publisher: - " + newPublisher.getClass().getSimpleName());
        publishers.add(newPublisher);
    }

    public static void hireAll(List<PublishWorker> publishWorkers) {
        publishWorkers.forEach(PublishingOffice::hire);
    }

    public static Book publishBook() {
        Book book = new Book();

        publishers.forEach(publisher -> {
            System.out.println(publisher.getClass().getSimpleName() + " do Book");
            publisher.doBook(book);
        });

        System.out.println("Publish new book!\n" + "Book Words: " + book.getWords() + "\n Book Paints: " + book.getPaints());
        return book;
    }
}
