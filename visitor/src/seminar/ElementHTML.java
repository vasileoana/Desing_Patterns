package seminar;

public abstract class ElementHTML {
    private String etichetaStart;
    private String etichetaEnd;

    public ElementHTML(String etichetaStart, String etichetaEnd) {
        this.etichetaStart = etichetaStart;
        this.etichetaEnd = etichetaEnd;
    }

    public String getEtichetaStart() {
        return etichetaStart;
    }

    public void setEtichetaStart(String etichetaStart) {
        this.etichetaStart = etichetaStart;
    }

    public String getEtichetaEnd() {
        return etichetaEnd;
    }

    public void setEtichetaEnd(String etichetaEnd) {
        this.etichetaEnd = etichetaEnd;
    }

    abstract void accept(Visitor v, String value);

    abstract String afiseaza();

    @Override
    public String toString() {
        return "ElementHTML{" +
                "etichetaStart='" + etichetaStart + '\'' +
                ", etichetaEnd='" + etichetaEnd + '\'' +
                '}';
    }
}
