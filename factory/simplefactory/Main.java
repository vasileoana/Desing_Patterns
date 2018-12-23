package simplefactory;

public class Main {
//
//    Oferă posibilitatea creării de obiecte concrete dintr-o familie de obiecte,
//    fără să se știe exact tipul concret al obiectului.
//    Sintagma după care este recunoscut este: familie de obiete sau obiecte
//    din aceeași familie.
//
    public static void main(String[] args) throws Exception {

        PachetTuristic cazare = AgentieSingletonFactory.getInstanta().createPachet(TipPachet.CAZARE);

       cazare.descriere();

    }
}
