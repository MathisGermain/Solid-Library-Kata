package domain;

import domain.models.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {

    void addBorrow(int userId, String bookTitle) throws SQLException;
    void createNewBook(String title, String authorName) throws SQLException;
    List<Book> getAllBook() throws SQLException;


}
