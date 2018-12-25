public class PachetTuristic {

    private double pret;
    private String numePachet;

    public PachetTuristic(double pret) {
        this.pret = pret;
    }

    public PachetTuristic(double pret, String numePachet) {
        this.pret = pret;
        this.numePachet = numePachet;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNumePachet() {
        return numePachet;
    }

    public void setNumePachet(String numePachet) {
        this.numePachet = numePachet;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "pret=" + pret +
                ", numePachet='" + numePachet + '\'' +
                '}';
    }

    public MementoPachetTuristic salvareMemento(){
        return new MementoPachetTuristic(pret);
    }

    public void undoToMemento(MementoPachetTuristic memento){
        this. pret = memento.getPretPachet();
    }
}
