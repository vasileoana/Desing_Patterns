package seminar;

import java.util.List;

public class ElementHTMLCompus extends ElementHTML {

    List<ElementHTML> elementHTMLList;

    public ElementHTMLCompus(String etichetaStart, String etichetaEnd, List<ElementHTML> elementHTMLList) {
        super(etichetaStart, etichetaEnd);
        this.elementHTMLList = elementHTMLList;
    }

    @Override
    void accept(Visitor v, String value) {
        for (ElementHTML elementHTML : elementHTMLList) {
            v.visit(elementHTML, value);
        }
    }

    @Override
    String afiseaza() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ElementHTML elementHTML : elementHTMLList) {
            stringBuilder.append(elementHTML.afiseaza());
        }
        return stringBuilder.toString();
    }
}