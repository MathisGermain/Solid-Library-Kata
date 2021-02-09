import domain.BookRepository;
import domain.models.Book;
import infrastructure.controller.BookController;
import use_case.AddNewBook;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userType;
        int action;

        BookController bookController;

        System.out.println("Sélectionner votre type d'utilisateur, tapez 1 pour vous connectez en tant que membres , tapez 2 pour vous connectez en tant que bibliothéquaire, ou n'importe quel autre touche pour continuez en tant qu'utilisateur");
        Scanner saisie = new Scanner(System.in);
        userType = saisie.nextInt();



        if(userType == 1){
            System.out.println("Pour consulter la liste des livres disponibles tapez 1 , pour emprunter un livre tapez 2");
            action = saisie.nextInt();
        }else if(userType == 2){
            System.out.println("Pour consulter la liste des livres disponibles tapez 1 , pour emprunter un livre tapez 2 , pour ajouter un nouveau livre tapez 3");
            action = saisie.nextInt();
        }else{
            System.out.println("Pour consulter la liste des livres disponibles tapez 1");
            action = saisie.nextInt();
            if(action == 1){
                //bookController.getAllAvailableBookList();
            }
        }

    }

}
