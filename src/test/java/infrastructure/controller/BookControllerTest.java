package infrastructure.controller;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import use_case.AddNewBook;
import use_case.BorrowABook;
import use_case.GetBookList;

public class BookControllerTest {

    @Mock
    private AddNewBook addNewBook;

    @Mock
    private BorrowABook borrowABook;

    @Mock
    private GetBookList getBookList;

    private BookController bookController;

    @BeforeEach
    void setUp(){
        bookController = new BookController(addNewBook,borrowABook,getBookList);
    }




}
