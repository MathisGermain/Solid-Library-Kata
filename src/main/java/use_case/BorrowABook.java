package use_case;

import domain.BookRepository;

public class BorrowABook {

    private final BookRepository bookRepository;

    public BorrowABook(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void userBorrowABook(int userId, String bookTitle){
        this.bookRepository.borrow(userId,bookTitle);
    }
}
