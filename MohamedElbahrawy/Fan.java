package MohamedElbahrawy;

import java.util.UUID;

public class Fan extends Person {
    protected String TicketID;

    public static String TicketIDGenerator() {
        String Ticket = UUID.randomUUID().toString();
        return Ticket.replace("-", "");
    }

    public Fan(String ID, String Name) {
        super(ID, Name);
    }

    public Fan() {
    }

    public String getTicketID() {
        return TicketID;
    }

    public void setTicketID(String ticketID) {
        TicketID = ticketID;
    }
}
