import Controller.BookController;
import Model.BookModel;
import View.BookView;

public class Main {

    public static void main(String[] args) {
        BookView bookView = new BookView();
        BookModel bookModel = new BookModel();
        BookController bookController = new BookController(bookModel, bookView);
        bookController.initStartView();

    }

}
