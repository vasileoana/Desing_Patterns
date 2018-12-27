package seminar;

public class ElementHTMLSimplu extends ElementHTML {
    public ElementHTMLSimplu(String etichetaStart, String etichetaEnd) {
        super(etichetaStart, etichetaEnd);
    }

    @Override
    void accept(Visitor v, String value) {
        v.visit(this, value);
    }

    @Override
    String afiseaza() {
        return super.toString();
    }
}
