package App.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Courier
{
    private String name;

    private UUID uuid = UUID.randomUUID();

    private List<Delivery> deliveries;

    private int home_branch_index;

    private Branch prev_branch;

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

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(uuid, courier.uuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", home_branch_index=" + home_branch_index +
                ", prev_branch=" + prev_branch +
                ", next_branch=" + next_branch +
                '}';
    }
}