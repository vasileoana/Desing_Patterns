package abstractfactory;

public class Main {

    // Fiecare fabrica de obiecte creează obiecte din doua sau mai multe familii de obiecte
    // Abstract Factory introduce un nou nivel de abstractizare.

   static PachetCazare obtineCazare(Factory fabrica){
        return fabrica.createPachetCazare();
    }

    public static void main(String[] args) {
        Factory factory = new FactoryCategoria1();
        PachetCazare pachetCazare = obtineCazare(factory);
        pachetCazare.descriere();
    }
}
