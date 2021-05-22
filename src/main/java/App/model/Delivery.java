package App.model;


import javax.persistence.*;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "current_branch_id")
    private Branch current;

    @ManyToOne
    @JoinColumn(name = "next_branch_id")
    private Branch next;

    @Column(name = "delivery_time")
    private double delivery_time;

    @ManyToOne
    @JoinColumn(name = "letter_id")
    private Letter letter;

    @Column(name = "delivered")
    private boolean delivered;


    public Delivery(Branch current, Branch next, double delivery_time, Letter letter, boolean delivered) {
        this.current = current;
        this.next = next;
        this.delivery_time = delivery_time;
        this.letter = letter;
        this.delivered = delivered;
    }

    public  Delivery (){

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

    public Integer getId() {
        return id;
    }
}