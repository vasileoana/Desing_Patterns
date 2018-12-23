public class Main {
//
//    Ajută la crearea de clone pentru obiectele a căror construire durează
//    foarte mult sau consumă foarte multe resurse.
//    Prin intermediul acestui design pattern se creează un obiect considerat
//    prototip. Acest prototip urmând a fi clonat pentru următoarele instanțe din
//    acea clasă.
//    Metoda de copiere trebuie implementată astfel încât să realizeze deep copy
//    Metoda clone din Cloneable nu face deep copy.

    public static void main(String[] args){
        IListaOferte listaOferte=new ListaOferte();
        listaOferte.incarcaListaOferte();

        //date nu se mai citesc inca o data din fisier
        IListaOferte copieListaOferte = null;
        copieListaOferte = listaOferte.copiaza();

        System.out.println(copieListaOferte.toString());

    }
}
