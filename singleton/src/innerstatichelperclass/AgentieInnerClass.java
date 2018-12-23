package innerstatichelperclass;

public class AgentieInnerClass {

//    Aceasă variantă a fost propusă de Bill Pugh și conține o clasă imbricată în clasa
//    Singleton.
//    Clasa Helper imbricată va fi încărcată doar când este apelată funcția de creare a
//    instanței.
//    Această variantă de Singleton îmbină Eager initialization cu Lazy initialization.

    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static class AgentieHelper{
        private static final AgentieInnerClass instanta = new AgentieInnerClass();
    }
    public static AgentieInnerClass getInstanta() {
        return AgentieHelper.instanta;
    }

    private AgentieInnerClass() {
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

    @Override
    public String toString() {
        return "AgentieInnerClass{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
