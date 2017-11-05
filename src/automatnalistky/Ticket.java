package automatnalistky;

public class Ticket {

    private double price;
    private String name;

    public Ticket(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
