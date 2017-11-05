package automatnalistky;

import java.math.MathContext;

public class Automat {

    private double paid;
    private double priceToPay;
    private int ticketsQuantity;

    public Automat() {
        this.paid = 0.0;
        this.priceToPay = 0.0;
        this.ticketsQuantity = 0;
    }

    public Ticket selectTicket(int selected) {
        Ticket newTicket;

        switch (selected) {
            case 1:
                newTicket = new Ticket(0.6, "Zakladny CL 30");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 2:
                newTicket = new Ticket(0.3, "Zlavneny CL 30");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 3:
                newTicket = new Ticket(0.7, "Zakladny CL 60");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 4:
                newTicket = new Ticket(0.35, "Zlavneny CL 60");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 5:
                newTicket = new Ticket(0.5, "Zakladny CL 4 zastavky");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 6:
                newTicket = new Ticket(0.25, "Zlavneny CL 4 zastavky");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 7:
                newTicket = new Ticket(3.2, "Zakladny CL 24hod");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 8:
                newTicket = new Ticket(1.6, "Zlavneny CL 24hod");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 9:
                newTicket = new Ticket(10.2, "Zakladny CL 7dnovy");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            case 10:
                newTicket = new Ticket(5.1, "Zlavneny CL 7dnovy");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;
            case 11:
                newTicket = new Ticket(1, "Zakladny CL nocny 60min");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;
            case 12:
                newTicket = new Ticket(0.6, "Zakladny Cl bazozina/zviera");
                priceToPay += newTicket.getPrice();
                ticketsQuantity++;
                return newTicket;

            default:
                return null;
        }

    }

    public double insertMoney(double value) {
        if (value > 0) {
            paid += value;
            return value;
        } else {
            return 0;
        }
    }

    public boolean checkMoneyStatus() {
        if (priceToPay <= paid) {
            return true;
        } else {
            return false;
        }
    }

    public double returnMoney() {
        double val = paid - priceToPay;
        val = val * 100;
        val = Math.round(val);
        val = val / 100;

        return Math.abs(val);
    }

    public int getTicketsQuantity() {
        return ticketsQuantity;
    }

    public double getPriceToPay() {
        double val = priceToPay;
        val = val * 100;
        val = Math.round(val);
        val = val / 100;
        return val;
    }

    public double getPaid() {
        return paid;
    }

}
