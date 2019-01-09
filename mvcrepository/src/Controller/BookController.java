package Controller;

import Model.BookModel;
import Model.MyActionEventAdapter;
import Model.MyActionListenerAdapter;
import Repository.BookRepository;
import View.BookView;

import java.util.List;

public class BookController {

    private BookModel bookModel;
    private BookView bookView;

    public BookController(BookModel bookM, BookView bookV) {
        bookModel = bookM;
        bookView = bookV;
        //set listeners
        this.bookView.setReadAllBooksListener(new MyActionListenerAdapter() {
            @Override
            public void actionPerformed(MyActionEventAdapter e) {
                List<BookModel> books = getAllBooks();
                bookView.displayAllBooks(books.toString());
            }
        });
        bookView.setReadASpecificBooksListener(new MyActionListenerAdapter() {
            @Override
            public void actionPerformed(MyActionEventAdapter e) {

                String bookId = e.getValue();
                bookView.displayOneBook(getBookById(bookId).toString());
            }
        });
        bookView.setDeleteASpecificBookListener(e -> {
            String bookId = e.getValue();
            deleteBook(bookId);
            bookView.displayMessage("Book was deleted");
        });
        bookView.setUpdateASpecificBookByStockListener(e -> {
            String id = e.getValue();
            String newStock = e.getObject().toString();
            bookModel = updateBookByStock(newStock, id);
            bookView.displayOneBook(bookModel.toString());
        });
        bookView.setAddSBookListener(new MyActionListenerAdapter() {
            @Override
            public void actionPerformed(MyActionEventAdapter e) {
                List<String> myBookValues = (List<String>) e.getObject();
                bookModel = new BookModel(myBookValues.get(0), myBookValues.get(1), myBookValues.get(2), myBookValues.get(3));
                addBook(bookModel);
                bookView.displayMessage("Carte adaugata");
            }
        });
        bookView.setSaveStateInBd(new MyActionListenerAdapter() {
            @Override
            public void actionPerformed(MyActionEventAdapter e) {
                saveStateInBD();
                bookView.displayMessage("Schimbari efectuate");
            }
        });
    }

    public void initStartView() {
        bookView.initMenu();
    }


    private List<BookModel> getAllBooks() {
        return BookRepository.getInstance().readAll();
    }

    private BookModel getBookById(String id) {
        return BookRepository.getInstance().getById(id);
    }

    private void deleteBook(String bookId) {
        BookRepository.getInstance().removeById(bookId);
    }

    private BookModel updateBookByStock(String newStock, String id) {
        return BookRepository.getInstance().updateByStock(id, newStock);
    }

    private void addBook(BookModel bookModel) {
        BookRepository.getInstance().add(bookModel);
    }

    private void saveStateInBD() {
        BookRepository.getInstance().save();
    }
}
