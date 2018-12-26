package exemplu_seminar;
//Simplificarea comunicării prin eliminarea relațiilor de tip mulți la mulți și transformarea acestora în relații de tip unu la mulți și mulți la unu
public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Chat();
        ((Chat) mediator).addUser(new Web(mediator));
        ((Chat) mediator).addUser(new Mobile(mediator));
        User user = new Mobile(mediator);
        user.sendMessage("llalala");
    }
}
