package use_case;

import domain.BookRepository;

import java.sql.SQLException;

public class AddNewBook {

    private final BookRepository bookRepository;

    public AddNewBook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String authorName) throws SQLException {
        this.bookRepository.createNewBook(title,authorName);
    }
}
