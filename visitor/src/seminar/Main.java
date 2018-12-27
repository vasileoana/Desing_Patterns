package seminar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Visitor cssId = new CSSIdVisitor();
        Visitor cssClass = new CSSClassVisitor();

        ElementHTML body = new ElementHTMLSimplu("<body","</body>");
        body.accept(cssId,"bodyId");
        System.out.println(body.afiseaza());


        ElementHTML bodyEl = new ElementHTMLCompus("<html","</html>",   new ArrayList<ElementHTML>() {{ add(body); }});
        bodyEl.accept(cssClass, "container");
        System.out.println(bodyEl.afiseaza());
    }
}
