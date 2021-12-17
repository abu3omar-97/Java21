package Week15;

import java.util.Date;

public class Ticket {
    private static int numberOfTickets;
    private int id;
    private String name;
    private Date expiryDate;


    public Ticket(){
        numberOfTickets++;
    }

    public static int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
