public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new PachetTuristic(243, "my pack");

        ManagerPacheteTuristice managerPachete = new ManagerPacheteTuristice();

        System.out.println(pachet.toString());

        managerPachete.adaugaMemento(pachet.salvareMemento());
        pachet.setPret(50);
        System.out.println(pachet.toString());
        pachet.setPret(100);
        managerPachete.adaugaMemento(pachet.salvareMemento());

        System.out.println(pachet.toString());
        pachet.setPret(200);
        System.out.println(pachet.toString());

        try {
            pachet.undoToMemento(managerPachete.getMemento(1));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(pachet.toString());
    }
}
