package View;

import Model.MyActionEventAdapter;
import Model.MyActionListenerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookView {


    private MyActionListenerAdapter readAllBooksListener;
    private MyActionListenerAdapter readASpecificBooksListener;
    private MyActionListenerAdapter deleteASpecificBookListener;
    private MyActionListenerAdapter updateASpecificBookByStockListener;
    private MyActionListenerAdapter addSBookListener;
    private MyActionListenerAdapter saveStateInBd;

    public BookView() {
    }


    public void setSaveStateInBd(MyActionListenerAdapter saveStateInBd) {
        this.saveStateInBd = saveStateInBd;
    }

    public void setAddSBookListener(MyActionListenerAdapter addSBookListener) {
        this.addSBookListener = addSBookListener;
    }

    public void setReadAllBooksListener(MyActionListenerAdapter readAllBooksListener) {
        this.readAllBooksListener = readAllBooksListener;
    }

    public void setReadASpecificBooksListener(MyActionListenerAdapter readASpecificBooksListener) {
        this.readASpecificBooksListener = readASpecificBooksListener;
    }

    public void setDeleteASpecificBookListener(MyActionListenerAdapter deleteASpecificBookListener) {
        this.deleteASpecificBookListener = deleteASpecificBookListener;
    }

    public void setUpdateASpecificBookByStockListener(MyActionListenerAdapter updateASpecificBookByStockListener) {
        this.updateASpecificBookByStockListener = updateASpecificBookByStockListener;
    }

    public void showMenuOptions() {
        System.out.println("\n\n---Meniu Principal BookStore---");
        System.out.println("1 = Afisare toate cartile");
        System.out.println("2 = Afisare carte dupa id");
        System.out.println("3 = Stergere carte dupa id");
        System.out.println("4 = Adaugare carte");
        System.out.println("5 = Actualizare stoc carte");
        System.out.println("6 = Salvare stare in BD");
        System.out.println("7 = Iesire din aplicatie");
    }

    public void initMenu() {
        showMenuOptions();

        Scanner scanner = new Scanner(System.in);
        String valueChosed = scanner.nextLine();
        switch (valueChosed) {
            case "1":
                this.readAllBooksListener.actionPerformed(new MyActionEventAdapter(this, "1"));
                initMenu();
                break;
            case "2":
                System.out.println("Enter id (example: 0)");
                scanner = new Scanner(System.in);
                String id = scanner.nextLine();
                this.readASpecificBooksListener.actionPerformed(new MyActionEventAdapter(this, id));
                initMenu();
                break;
            case "3":
                System.out.println("Enter id (example: 0)");
                scanner = new Scanner(System.in);
                id = scanner.nextLine();
                this.deleteASpecificBookListener.actionPerformed(new MyActionEventAdapter(this, id));
                initMenu();
                break;
            case "4":
                System.out.println("Enter new book");
                System.out.println("Title");
                scanner = new Scanner(System.in);
                String titlu = scanner.nextLine();
                System.out.println("Autor");
                scanner = new Scanner(System.in);
                String autor = scanner.nextLine();
                System.out.println("Pret");
                scanner = new Scanner(System.in);
                String pret = scanner.nextLine();
                System.out.println("Stoc");
                scanner = new Scanner(System.in);
                String stoc = scanner.nextLine();
                List<String> bookValues = new ArrayList<>();
                bookValues.add(titlu);
                bookValues.add(autor);
                bookValues.add(pret);
                bookValues.add(stoc);
                this.addSBookListener.actionPerformed(new MyActionEventAdapter(bookValues));
                initMenu();
                break;
            case "5":
                System.out.println("Enter id (example: 1)");
                scanner = new Scanner(System.in);
                id = scanner.nextLine();
                System.out.println("Enter new stock:");
                scanner = new Scanner(System.in);
                String newStock = scanner.nextLine();
                this.updateASpecificBookByStockListener.actionPerformed(new MyActionEventAdapter(newStock, id));
                initMenu();
                break;
            case "6":
                this.saveStateInBd.actionPerformed(new MyActionEventAdapter(this));
                initMenu();
                break;
            case "7":
                break;
            default:
                errorMessage("Please choose a valid option");
        }


    }

    private void errorMessage(String s) {
        System.out.println(s);
    }

    public void displayAllBooks(String allBooks) {
        System.out.println("All books:\n" + allBooks);
    }

    public void displayOneBook(String book) {
        System.out.println(" My book:\n" + book);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
