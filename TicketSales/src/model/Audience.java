package model;

/**
 * 관람객 도메인 클래스
 * 소지품을 가방에 보관하고 있다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    /**
     * Ticket 구매 혹은 교환
     * @param ticket
     * @return 구매 혹은 교환에 사용한 비용
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
