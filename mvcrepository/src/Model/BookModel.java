package Model;

public class BookModel {
    public static int ID_KEY = 0;

    private int id;
    private String titlu;
    private String autor;
    private String pret;
    private String stoc;

    public BookModel(){

    }

    public BookModel(int id, String titlu, String autor, String pret, String stoc) {
        this.id = id;
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
        this.stoc = stoc;
    }

    public BookModel(String titlu, String autor, String pret, String stoc) {
        setId();
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
        this.stoc = stoc;
    }

    public int getId() {
        return id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setId() {
        this.id = ID_KEY++;
    }


    public String getPret() {
        return pret;
    }


    public String getStoc() {
        return stoc;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        return "\nBookModel{" +
                "id=" + id +
                ", titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", pret='" + pret + '\'' +
                ", stoc='" + stoc + '\'' +
                '}';
    }
}
