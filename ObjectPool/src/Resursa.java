public class Resursa {

    private int id;
    private String descriere;

    public Resursa(int id, String descriere) {
        this.id = id;
        this.descriere = descriere;
    }

      public  void utilizeaza(){
        System.out.println("Id: " + this.id + "Resursa: "+ this.descriere);
    }


    @Override
    public String toString() {
        return " Resursa{" +
                "id=" + id +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
