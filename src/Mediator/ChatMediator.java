package Mediator;

// mediator
// Interface für Mediatoren
public interface ChatMediator {

    public void sendMessage(String msg, Colleague coll);

    void addColleague(Colleague coll);
}
