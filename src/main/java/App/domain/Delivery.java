package App.domain;


import java.util.UUID;


public class Delivery {

    private Branch current;

    private Branch next;

    private double delivery_time;

    private Letter letter;

    private boolean delivered;

    private UUID uuid = UUID.randomUUID();

    public Delivery(Branch current, Branch next, double delivery_time, Letter letter, boolean delivered) {
        this.current = current;
        this.next = next;
        this.delivery_time = delivery_time;
        this.letter = letter;
        this.delivered = delivered;
    }

    public Branch getCurrent() {
        return current;
    }

    public void setCurrent(Branch current) {
        this.current = current;
    }

    public Branch getNext() {
        return next;
    }

    public void setNext(Branch next) {
        this.next = next;
    }

    public double getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(double delivery_time) {
        this.delivery_time = delivery_time;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public UUID getUuid() {
        return uuid;
    }
}