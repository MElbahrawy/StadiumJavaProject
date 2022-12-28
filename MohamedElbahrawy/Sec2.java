package MohamedElbahrawy;

public class Sec2 implements Stadium {
    protected final int price = 100;
    protected final int NoOfSeats = 250;
    protected int SeatsAvailable = NoOfSeats;

    public int getSeatsAvailable() {
        return SeatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        SeatsAvailable = seatsAvailable;
    }

    public int getPrice() {
        return price;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

}
