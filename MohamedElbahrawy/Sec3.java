package MohamedElbahrawy;

public class Sec3 implements Stadium {
    protected final int price = 50;
    protected final int NoOfSeats = 650;
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
