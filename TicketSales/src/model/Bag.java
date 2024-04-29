package model;

/**
 * 관람객의 가방을 나타내는 도메인 오브젝트
 */
public class Bag {
    /** 보유 금액 */
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 초대권이 있는 경우
     * @param invitation 초대권
     * @param amount 보유 금액
     */
    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    /**
     * 초대권이 없는 경우
     * @param amount 보유 금액
     */
    public Bag(long amount) {
        this(null, amount);
    }

    /**
     * 초대권 소지 여부 판별 후, Ticket 교환
     * @param ticket
     * @return 티켓 교환 값
     */
    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    /**
     * 초대장 소유 여부를 나탄낸다.
     * @return 초대장 소유 여부
     */
    public boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * 티켓 소유 여부를 나탄낸다.
     * @return 티켓 소유 여부
     */
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
