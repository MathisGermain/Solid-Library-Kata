package infrastructure.dao;

import domain.BookRepository;
import domain.models.Book;

import java.util.List;

public class InMemoryBook implements BookRepository {

    public void createNewBook(String title, String authorName){
        Book newBook = new Book(title,authorName);
        // Ajouté à la db
    }

    public List<Book> getAllBook(){
        List<Book> bookList = null;
        // Récupérer depuis la db
        return bookList;
    }

    public void borrow(int userId, String bookTitle){
        // Ajouter un emprunt en db
    }




}
