package ru.apzakharov.BookCreators;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.apzakharov.Book;
import ru.apzakharov.BookCreators.Instrument.Pen;
import ru.apzakharov.PublishWorker;

@RequiredArgsConstructor
@Builder
@Getter
@Setter
public class Writer implements PublishWorker {

   private final BookCreator pen = new Pen();

   @Override
   public Book doBook(Book book) {
      return pen.doBook(book);
   }
}
