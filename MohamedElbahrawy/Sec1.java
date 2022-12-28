package MohamedElbahrawy;

public class Sec1 implements Stadium {
    protected final int price = 200;
    protected final int NoOfSeats = 100;
    protected int SeatsAvailable = NoOfSeats;

    public Sec1() {
    }

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
