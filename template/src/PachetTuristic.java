public abstract  class PachetTuristic {
    protected int codPachet;

    public PachetTuristic(int codPachet){
        this.codPachet = codPachet;
    }

    public abstract void cautareCazare(int codPachet);
    public abstract void cautareTransport(int codPachet);
    public abstract void rezervaPachet(int codPachet);
    public abstract void platirePachet(int codPachet);

    public final void vindePachet(){
        cautareCazare(this.codPachet);
        cautareTransport(this.codPachet);
        rezervaPachet(this.codPachet);
        platirePachet(this.codPachet);
    }
}
