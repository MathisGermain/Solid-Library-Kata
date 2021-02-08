package use_case;

import domain.BookRepository;

public class AddNewBook {

    private final BookRepository bookRepository;

    public AddNewBook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String authorName){
        this.bookRepository.createNewBook(title,authorName);
    }
}
