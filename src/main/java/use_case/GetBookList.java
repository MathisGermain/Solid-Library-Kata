package use_case;

import domain.BookRepository;
import domain.models.Book;

import java.sql.SQLException;
import java.util.List;

public class GetBookList {

    private final BookRepository bookRepository;

    public GetBookList(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllAvailableBook() throws SQLException {
        return this.bookRepository.getAllBook();
    }
}
