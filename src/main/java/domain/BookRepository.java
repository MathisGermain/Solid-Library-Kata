package domain;

import domain.models.Book;

import java.util.List;

public interface BookRepository {

    void borrow(int userId, String bookTitle);
    void createNewBook(String title, String authorName);
    List<Book> getAllBook();


}
