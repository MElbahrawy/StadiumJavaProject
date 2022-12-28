package MohamedElbahrawy;

import java.util.Date;
import java.util.Scanner;

public class Sec1Booking extends Sec1 {
    Scanner input = new Scanner(System.in);
    protected Fan p = new Fan();
    Date DateMade = new Date();
    protected final String Section = "Sec A";

    public Sec1Booking() {

    }

    public Sec1Booking(String name, String id) {
        p.setName(name);
        p.setID(id);
        SeatsAvailable--;
        p.setTicketID(Fan.TicketIDGenerator());
    }

    public String GetID() {
        return p.getID();
    }

    public String PersonInfo() {
        return "\nName : " + p.getName() + "\nTicket ID : " + p.getTicketID();
    }

    @Override
    public String toString() {
        return "\nTicket checked\nName : " + p.getName() + "\nID : " + p.getID() + "\nSection : " + Section
                + "\nPrice : $" + price + "\nTicket ID : " + p.getTicketID() + "\nBooked Date : " + DateMade;
    }

}
