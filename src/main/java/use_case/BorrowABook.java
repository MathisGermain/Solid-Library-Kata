package use_case;

import domain.BookRepository;

import java.sql.SQLException;

public class BorrowABook {

    private final BookRepository bookRepository;

    public BorrowABook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void userBorrowABook(int userId, String bookTitle) throws SQLException {
        this.bookRepository.addBorrow(userId,bookTitle);
    }
}
