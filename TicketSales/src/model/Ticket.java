package model;

/**
 * 티켓 도메인 오브젝트 클래스
 */
public class Ticket {
    private Long fee;

    public void setFee(Long amount) {
        this.fee = amount;
    }

    public Long getFee() {
        return fee;
    }
}
