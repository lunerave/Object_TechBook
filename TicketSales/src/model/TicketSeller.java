package model;

/**
 * 티켓 판매원 도메인 오브젝트 클래스
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
