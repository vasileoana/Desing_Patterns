package seminar;

public class CSSIdVisitor  implements Visitor{
    @Override
    public void visit(ElementHTML elementHTML, String value) {
        elementHTML.setEtichetaStart(elementHTML.getEtichetaStart().concat(" id=\"" + value + "\"" + ">"+ elementHTML.getEtichetaEnd()));
    }
}
