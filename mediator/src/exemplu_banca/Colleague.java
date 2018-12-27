package exemplu_banca;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //send message via the mediator
    public abstract void go(Message message);

    public Mediator getMediator(){
        return mediator;
    }
}
