package infrastructure.dao;

import domain.BookRepository;
import domain.models.Book;
import utils.SqlConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InMemoryBook implements BookRepository{

    public void createNewBook(String title, String authorName) throws SQLException {
        String query = "INSERT INTO books VALUES('"+title+"','"+authorName+"','available')";
        Connection connect = SqlConnector.openConnection();
        Statement statement = connect.createStatement();
        statement.executeQuery(query);

        statement.close();
        connect.close();

    }

    public List<Book> getAllBook() throws SQLException{
        List<Book> bookList = null;
        String query = "SELECT * FROM books WHERE status = available";
        Connection connect = SqlConnector.openConnection();
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while ( resultSet.next() ) {
            String title = resultSet.getString("title");
            String authorName = resultSet.getString("Author");
            Book newBook = new Book(title,authorName);
            bookList.add(newBook);
        }

        return bookList;
    }

    public void addBorrow(int userId, String bookTitle) throws SQLException{
        String query = "INSERT INTO borrow VALUES('"+userId+"','"+bookTitle+"')";
        Connection connect = SqlConnector.openConnection();
        Statement statement = connect.createStatement();
        statement.executeQuery(query);

        statement.close();
        connect.close();

    }




}
