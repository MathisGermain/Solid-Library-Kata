package infrastructure.controller;

import use_case.AddNewBook;
import use_case.BorrowABook;
import use_case.GetBookList;

public class BookController {

    private final AddNewBook addNewBook;
    private final BorrowABook borrowABook;
    private final GetBookList getBookList;

    public BookController(AddNewBook addNewBook, BorrowABook borrowABook, GetBookList getBookList) {
        this.addNewBook = addNewBook;
        this.borrowABook = borrowABook;
        this.getBookList = getBookList;
    }


}
