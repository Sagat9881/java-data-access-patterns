package ru.apzakharov.BookCreators;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.apzakharov.Book;
import ru.apzakharov.BookCreators.Instrument.Brush;
import ru.apzakharov.PublishWorker;

@RequiredArgsConstructor
@Builder
@Getter
@Setter
public class Artist implements PublishWorker {

    private final BookCreator brush = new Brush();


    @Override
    public Book doBook(Book book) {
        return brush.doBook(book);
    }
}
