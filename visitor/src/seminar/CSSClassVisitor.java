package seminar;

public class CSSClassVisitor implements Visitor {
    @Override
    public void visit(ElementHTML elementHTML, String value) {
        elementHTML.setEtichetaStart(elementHTML.getEtichetaStart().concat(" class=\"" + value + "\"" + ">" + elementHTML.getEtichetaEnd()));
    }
}
