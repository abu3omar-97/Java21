package ActivityPark;

public class Ticket {
    int price = 10;
    int type;
    boolean isUsed = true;

    public Ticket(int price, int type) {
        this.price = price;
        this.type = type;
    }
}
