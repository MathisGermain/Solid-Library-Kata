package infrastructure.controller;

import domain.models.Book;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import use_case.AddNewBook;
import use_case.BorrowABook;
import use_case.GetBookList;
import utils.SqlConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void call_AddNewBook() throws SQLException {

        int numberOfBook;

        List<Book> bookList = new ArrayList<Book>();
        String query = "SELECT count(*) FROM books";
        Connection connect = SqlConnector.openConnection();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        numberOfBook = resultSet.getInt("count(*)");
        bookController.AddANewBookInLibrary("Test","Test");
        resultSet = statement.executeQuery(query);

        assertThat(resultSet.getInt("count(*)")!=(numberOfBook));

    }


}
