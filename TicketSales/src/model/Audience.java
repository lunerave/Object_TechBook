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

    public Bag getBag() {
        return bag;
    }
}
