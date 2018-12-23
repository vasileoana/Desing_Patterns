package constantenum;

public enum AgentieEnum {
    instanta;

    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private AgentieEnum() {
        this.numeAgentie = "AgeTur";
        this.capital = 1000;
        this.numarAngajati = 5;
    }

    @Override
    public String toString() {
        return "AgentieEnum{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
