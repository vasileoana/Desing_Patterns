package hotel;

public class VerificareEuropeniNonUE implements ModVerificare {
    @Override
    public void verificaActe(String nume) {
        System.out.println("Am verificat pasaportul lui " + nume);
    }
}
