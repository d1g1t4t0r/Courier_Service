package App.dto;


import App.model.Branch;
import App.model.Delivery;
import App.model.Letter;

import javax.persistence.*;

@Entity
@Table(name = "deliveries")
public class DeliveryDto {

    private BranchDto current;

    private BranchDto next;

    private double delivery_time;

    private LetterDto letter;

    private boolean delivered;


    public DeliveryDto(BranchDto current, BranchDto next, double delivery_time, LetterDto letter, boolean delivered) {
        this.current = current;
        this.next = next;
        this.delivery_time = delivery_time;
        this.letter = letter;
        this.delivered = delivered;
    }

    public DeliveryDto(Delivery delivery) {
        this.current = new BranchDto(delivery.getCurrent());
        this.next = new BranchDto(delivery.getNext());
        this.delivery_time = delivery.getDelivery_time();
        this.letter = new LetterDto(delivery.getLetter());
        this.delivered = delivery.isDelivered();
    }

    public BranchDto getCurrent() {
        return current;
    }

    public void setCurrent(BranchDto current) {
        this.current = current;
    }

    public BranchDto getNext() {
        return next;
    }

    public void setNext(BranchDto next) {
        this.next = next;
    }

    public double getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(double delivery_time) {
        this.delivery_time = delivery_time;
    }

    public LetterDto getLetter() {
        return letter;
    }

    public void setLetter(LetterDto letter) {
        this.letter = letter;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

}