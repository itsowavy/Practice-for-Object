package itsowavy.object.ticket_app.v1;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            Long fee = ticket.getFee();
            audience.getBag().minusAmount(fee);
            ticketSeller.getTicketOffice().plusAmount(fee);
            audience.getBag().setTicket(ticket);
        }
    }
}
