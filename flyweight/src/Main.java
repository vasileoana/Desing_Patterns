public class Main {
//    Este utilizat atunci când trebuie să construim foarte multe obiecte/instanțe
//    ale unei clase, însă majoritatea obiectelor au o parte comună, sau
//    permanentă.
//    Astfel prin utilizarea design pattern-ului Flyweight se reduce consumul de
//    memorie, păstrându-se într-o singură instanță partea comună.
//    Partea care diferă de la un obiect la altul este salvată într-o altă clasă și
//    este adăugat după construirea obiectelor.

    public static void main(String[] args){
        FabricaDePachete fabricaPachete = new FabricaDePachete();
        Optionale optional1=new Optionale(true, 3);
        Optionale optional2=new Optionale(false, 3);
        Optionale optional3=new Optionale(true, 1);
        Optionale optional4=new Optionale(true, 5);

        PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
        pachet.descriePachet(optional1);
        fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
        optional2.setNumarExcursii(40);
        fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
        fabricaPachete.getPachetTuristic(2).descriePachet(optional3);
        fabricaPachete.getPachetTuristic(1).descriePachet(optional4);

        System.out.println(fabricaPachete.getNrPachete());
    }
}
