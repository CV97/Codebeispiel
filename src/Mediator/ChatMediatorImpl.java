package Mediator;

// mediator
// konkrete Mediator-Klasse mit Logik für Kommunikation zwischen den Kollegen
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<Colleague> colleagues;

    public ChatMediatorImpl(){
        this.colleagues=new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague coll){
        this.colleagues.add(coll);
    }

    @Override
    public void sendMessage(String msg, Colleague coll) {
        for(Colleague c : this.colleagues){
            // Nachricht soll nicht vom Absender empfangen werden
            if(c != coll){
                c.receive(msg);
            }
        }
    }
}
