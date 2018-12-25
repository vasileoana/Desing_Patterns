//Este utilizat atunci când se dorește păstrarea funcționalității unei clase,
//însă aceasta se va realiza doar în anumite condiții.
//Prin Proxy se controlează comportamentul și accesul la un obiect

package agentie;

public class Main {
    public static void main(String[] args){

        Persoana student = new Persoana("Ion", 20);
        Persoana pensionar = new Persoana("Dorel", 67);

        PachetTransport pachetTuristicStudent = new PachetTransport(student);
        PachetTransport pachetTuristicPensionar = new PachetTransport(pensionar);
        pachetTuristicStudent.rezervaPachet();

        ProxyPachet proxyPachet = new ProxyPachet(pachetTuristicStudent);
        proxyPachet.descriere();
        proxyPachet.rezervaPachet();

        proxyPachet = new ProxyPachet(pachetTuristicPensionar);
        proxyPachet.descriere();
        proxyPachet.rezervaPachet();


    }
}
