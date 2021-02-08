package infrastructure.controller;

import domain.models.Book;
import use_case.AddNewBook;
import use_case.BorrowABook;
import use_case.GetBookList;

import java.sql.SQLException;
import java.util.List;

public class BookController {

    private final AddNewBook addNewBook;
    private final BorrowABook borrowABook;
    private final GetBookList getBookList;

    public BookController(AddNewBook addNewBook, BorrowABook borrowABook, GetBookList getBookList) {
        this.addNewBook = addNewBook;
        this.borrowABook = borrowABook;
        this.getBookList = getBookList;
    }

    public void AddANewBookInLibrary(String title,String author){
        try{
            this.addNewBook.addBook(title, author);
        }catch (SQLException e){

        }
    }

    public void getAllAvailableBookList(){
        try{
            List<Book> bookList = this.getBookList.getAllAvailableBook();
            for(Book book : bookList){
                System.out.println("Titre : " + book.getTitle() + " écrit par " + book.getAuthorName());
            }

        }catch (SQLException e){

        }
    }


}
