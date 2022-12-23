package tickets;

public class Ticket {
    private double ticketPrice;
    private int numberOfTicketPlace;
    private int classOfTicket;

    public Ticket(double ticketPrice, int numberOfTicket, int classOfTicket) {
        this.ticketPrice = ticketPrice;
        this.numberOfTicketPlace = numberOfTicket;
        this.classOfTicket = classOfTicket;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTicketPlace() {
        return numberOfTicketPlace;
    }

    public void setNumberOfTicketPlace(int numberOfTicketPlace) {
        this.numberOfTicketPlace = numberOfTicketPlace;
    }

    public int getClassOfTicket() {
        return classOfTicket;
    }

    public void setClassOfTicket(int classOfTicket) {
        this.classOfTicket = classOfTicket;
    }
}
