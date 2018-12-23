package staticblock;

public class AgentieStaticBlock {

//    Este asemănătoare cu eager initialization doar că această variantă
//    furnizează posibilitatea de captare a posibilelor excepții generate de inițializarea instanței statice.
//    Aceste două variante de Singleton inițializează instanța chiar dacă nu este folosită

    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieStaticBlock instanta;

    static {
        try {
            instanta = new AgentieStaticBlock();
        } catch(Exception ex){
            System.out.println("Agentia nu poate fi creata!");
        }
    }

    private AgentieStaticBlock() {
        this.numeAgentie = "AgeTur";
        this.capital = 1000;
        this.numarAngajati = 5;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieStaticBlock getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        return "AgentieStaticBlock{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}

