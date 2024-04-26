import model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        
        ticket1.setFee(100L);
        ticket2.setFee(100L);

        TicketOffice ticketOffice = new TicketOffice(0L, ticket1, ticket2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Bag dontHaveInvitationBag = new Bag(100L);
        Audience dontHaveInvitationAudience = new Audience(dontHaveInvitationBag);
        theater.enter(dontHaveInvitationAudience);
        System.out.println("ticketOffice sales= " + ticketOffice.getAmount());

        Bag hasInvitationBag = new Bag(new Invitation(), 100L);
        Audience hasInvitationAudience = new Audience(hasInvitationBag);
        theater.enter(hasInvitationAudience);
        System.out.println("ticketOffice sales= " + ticketOffice.getAmount());
    }
}