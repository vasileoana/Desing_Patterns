package Repository;

import Model.BookModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository implements Repository<BookModel> {

    private static BookRepository instance = null;
    private List<BookModel> bookList;
    private static String FILE_NAME = "repo.txt";

    private BookRepository() {
        bookList = new ArrayList<>();
        readFromDatabaseMock();
    }

    public static BookRepository getInstance() {
        if (instance == null) {
            instance = new BookRepository();
        }
        return instance;
    }

    @Override
    public void add(BookModel item) {
        item.setId();
        bookList.add(item);
    }

    @Override
    public void remove(BookModel item) {
        bookList.remove(item);
    }

    @Override
    public void removeById(String id) {
        remove(getById(id));
    }

    @Override
    public void update(BookModel item) {
        int indexItemUpdate = bookList.indexOf(item);
        bookList.set(indexItemUpdate, item);
    }

    public BookModel updateByStock(String id, String newStock) {
        BookModel bookModel = getById(id);
        bookModel.setStoc(newStock);
        update(bookModel);
        return bookModel;
    }


    @Override
    public List<BookModel> readAll() {
        return this.bookList;
    }

    @Override
    public void save() {
        BufferedWriter bw = null;
        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (BookModel book : bookList) {
                bw.write(getLineToWrite(book));
                bw.newLine();
            }
            System.out.println("File " + FILE_NAME + " written Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    @Override
    public BookModel getById(String id) {
        return this.bookList.stream().filter(book -> String.valueOf(book.getId()).equals(id)).findAny().get();
    }

    private String getLineToWrite(BookModel book) {
        return book.getTitlu() + ";" + book.getAutor() + ";" + book.getPret() + ";" + book.getStoc() + ";" + book.getId();
    }

    private void readFromDatabaseMock() {
        InputStream ins = null;
        BufferedReader br = null;
        try {
            String line;
            ins = new FileInputStream(FILE_NAME);
            br = new BufferedReader(new InputStreamReader(ins));
            while ((line = br.readLine()) != null) {
                String[] bookLine = line.split(";");
                String titlu = bookLine[0].trim();
                String autor = bookLine[1].trim();
                String pret = bookLine[2].trim();
                String stoc = bookLine[3].trim();
                int id = Integer.parseInt(bookLine[4].trim());
                BookModel bookModel = new BookModel(id, titlu, autor, pret, stoc);
                this.bookList.add(bookModel);
            }
            System.out.println("File " + FILE_NAME + " readed Successfully");
            setLatestId();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Throwable e) {
                    System.err.println(e.getMessage());
                }
            }
            if (ins != null) {
                try {
                    ins.close();
                } catch (Throwable e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    private void setLatestId() {
        BookModel.ID_KEY = getBigestIdFromDB() + 1;
    }

    private int getBigestIdFromDB() {
        return this.bookList.stream().max(Comparator.comparing(book -> book.getId())).get().getId();
    }
}
