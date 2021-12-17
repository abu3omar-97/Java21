package ActivityPark;

import java.util.Random;

public class Main {

    public static int getRandomAge(){
        Random rand = new Random();
        return rand.nextInt(40) + 1;
    }

    public static void main(String[] args) {


        // FOUR TYPES OF TICKETS
        Ticket kidsTicket = new Ticket(7,1);
        Ticket normalTicket = new Ticket(10,2);
        Ticket vipTicket = new Ticket(15,3);
        Ticket extremeTicket = new Ticket(20,4);

        Player sameer = new Player(kidsTicket);
        Player yaman = new Player(vipTicket);


        Activity rollerCoaster = new Activity();
        rollerCoaster.setName("AMAZING ROLLER COASTER");
        rollerCoaster.setMinLevel(2);
        rollerCoaster.setNumberOfMaxPlayers(40);
        rollerCoaster.setPrice(30);
        rollerCoaster.setPlayer(yaman);



        Player[] players = new Player[100];


        for (int i = 0; i < players.length; i++) {
            int playerAge = getRandomAge();

            if(playerAge < 15) {players[i] = new Player(kidsTicket);}
            else {players[i] = new Player(normalTicket);}
            players[i].name = "P" + (i+1);
            players[i].age = playerAge;

        }

        for ( Player p: players ) {
            System.out.print("NAME: " + p.name);
            System.out.println(" AGE: " + p.age);
        }


    }
}
