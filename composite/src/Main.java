//Este un design patterns structural folosit atunci când este necesară
//crearea unei structuri ierahice sau o structură arborescentă prin
//compunerea de obiecte

public class Main {

    public static void main(String[] args) {
        Optiune cFile = new Categorie("File");
        Optiune cCamere = new Categorie("Camere");
        Optiune cOferta = new Categorie("Oferte");

        Optiune iOpen = new Item("Open");
        Optiune iSave = new Item("Save");
        Optiune iVizualizare = new Item("Vizualizare camere");
        Optiune iEditare=new Item("Editare camere");
        Optiune iOfertaCraciun = new Item("Oferta Craciun!");
        Optiune iCreeazaOferta = new Item("Creeaza oferta");

        try {
            cCamere.adaugaNod(iVizualizare);
            cCamere.adaugaNod(iEditare);

            cOferta.adaugaNod(iOfertaCraciun);
            cOferta.adaugaNod(iCreeazaOferta);

            cFile.adaugaNod(iOpen);
            cFile.adaugaNod(iSave);
            cFile.adaugaNod(cCamere);
            cFile.adaugaNod(cOferta);

            cFile.stergeNod(iSave);
            cOferta.adaugaNod(iSave);

            cFile.descriere();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
