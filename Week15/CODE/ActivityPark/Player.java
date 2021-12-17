package ActivityPark;

public class Player {
    // WHAT IT HAS?
    String name;
    int age;
    // has-a
    Ticket playerTicket;

    public Player(Ticket ticket){
        this.playerTicket = ticket;
        this.playerTicket.isUsed = false;
    }

}
