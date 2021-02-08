package use_case;

import domain.BookRepository;
import domain.models.Book;

import java.util.List;

public class GetBookList {

    private final BookRepository bookRepository;

    public GetBookList(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    List<Book> getAllAvailableBook(){
        return this.bookRepository.getAllBook();
    }
}
