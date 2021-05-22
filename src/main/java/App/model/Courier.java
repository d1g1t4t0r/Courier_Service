package App.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "couriers")
public class Courier
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Delivery> deliveries;

    @Column(name = "address")
    private int home_branch_index;

    @ManyToOne
    @JoinColumn(name = "prev_branch_id")
    private Branch prev_branch;

    @ManyToOne
    @JoinColumn(name = "next_branch_id")
    private Branch next_branch;

    public Courier (String name, int home_branch, List<Delivery> deliveries) {
        this.name = name;
        this.home_branch_index = home_branch;
        this.deliveries = deliveries;
        prev_branch = null;
        next_branch = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public int getHome_branch_index() {
        return home_branch_index;
    }

    public void setHome_branch_index(int home_branch_index) {
        this.home_branch_index = home_branch_index;
    }

    public Branch getPrev_branch() {
        return prev_branch;
    }

    public void setPrev_branch(Branch prev_branch) {
        this.prev_branch = prev_branch;
    }

    public Branch getNext_branch() {
        return next_branch;
    }

    public void setNext_branch(Branch next_branch) {
        this.next_branch = next_branch;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(id, courier.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", home_branch_index=" + home_branch_index +
                ", prev_branch=" + prev_branch +
                ", next_branch=" + next_branch +
                '}';
    }
}