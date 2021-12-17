package ActivityPark;

public class Activity {
    private String name;
    private int minLevel;
    private Ticket ticket;
    private Player player;
    private int price;
    private int numberOfMaxPlayers;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
        if(!this.isAllowed()) {
            this.player = null;
        System.out.println("PLAYER NOT ALLOWED"); }
    }

    public boolean isAllowed(){
        if(this.player.playerTicket.type < this.minLevel) return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfMaxPlayers() {
        return numberOfMaxPlayers;
    }

    public void setNumberOfMaxPlayers(int numberOfMaxPlayers) {
        this.numberOfMaxPlayers = numberOfMaxPlayers;
    }
}
