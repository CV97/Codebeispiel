package Mediator;

// colleague
// konkrete Kollegen-Klasse zum Erstellen von Kollegen

public class ColleagueImpl extends Colleague {

    public ColleagueImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
