public  abstract  class OfertaPachetTuristic implements  PachetTuristic {
    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
        System.out.println("Aici se poate modifica functionalitatea Pachetelui turistica existenta");
    }

    //adaugare de functionalitati noi
    public abstract void anulareRezervare();

}
