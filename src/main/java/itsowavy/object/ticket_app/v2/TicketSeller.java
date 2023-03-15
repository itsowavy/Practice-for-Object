package itsowavy.object.ticket_app.v2;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
        // ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
