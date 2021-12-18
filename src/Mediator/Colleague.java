package Mediator;

// colleague
// abstrakte Klasse für Kollegen
public abstract class Colleague {
    protected ChatMediator mediator;
    protected String name;

    public Colleague(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
