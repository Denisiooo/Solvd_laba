package tickets;

import java.util.Map;

public class Ticket {
    TicketRate ticketRate;
    private String place;
    private String additionalServices;

    public Ticket(TicketRate ticketRate, String place, String additionalServices) {
        this.ticketRate = ticketRate;
        this.place = place;
        this.additionalServices = additionalServices;
    }

    public static Map<TicketRate, Ticket> addTicketClass() {
        return Map.of(TicketRate.USUAL, new Ticket(TicketRate.USUAL, "tribune", "no"),
                TicketRate.VIP, new Ticket(TicketRate.VIP, "VIP box", "food, drinks, sofa, great view"));
    }

    public TicketRate getTicketRate() {
        return ticketRate;
    }

    public void setTicketRate(TicketRate ticketRate) {
        this.ticketRate = ticketRate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }

    @Override
    public String toString() {
        return "Your ticketRate = " + ticketRate +
                ", place = " + place + '\'' +
                ", additionalServices = " + additionalServices + '\'' +
                '}';
    }
}
