package Mediator;

// konkretes Beispiel
public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        Colleague coll1 = new ColleagueImpl(mediator, "Robin");
        Colleague coll2 = new ColleagueImpl(mediator, "Lisa");
        Colleague coll3 = new ColleagueImpl(mediator, "Manfred");
        Colleague coll4 = new ColleagueImpl(mediator, "David");
        mediator.addColleague(coll1);
        mediator.addColleague(coll2);
        mediator.addColleague(coll3);
        mediator.addColleague(coll4);

        coll1.send("Hi All");
    }
}
