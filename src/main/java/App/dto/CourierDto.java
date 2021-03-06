package App.dto;

import App.model.Branch;
import App.model.Courier;
import App.model.Delivery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "couriers")
public class CourierDto
{

    private String name;


    private List<DeliveryDto> deliveries;

    private int home_branch_index;

    private BranchDto prev_branch;

    private BranchDto next_branch;

    public CourierDto(String name, int home_branch, List<DeliveryDto> deliveries) {
        this.name = name;
        this.home_branch_index = home_branch;
        this.deliveries = deliveries;
        prev_branch = null;
        next_branch = null;
    }

    public CourierDto(String name, int home_branch, List<Delivery> deliveries, Branch prev, Branch next) {
        this.name = name;
        this.home_branch_index = home_branch;
        List<DeliveryDto> deliveryDtos = new ArrayList<>();

        for (int i = 0; i<deliveries.size(); i++) {
            deliveryDtos.add(new DeliveryDto(deliveries.get(i)));
        }
        this.deliveries = deliveryDtos;
        prev_branch = new BranchDto(prev);
        next_branch = new BranchDto(next);
    }

    public CourierDto(Courier courier) {
        this.name = courier.getName();
        this.home_branch_index = courier.getHome_branch_index();

        List<DeliveryDto> deliveryDtos = new ArrayList<>();

        for (var del: courier.getDeliveries()) {
            deliveryDtos.add(new DeliveryDto(del));
        }
        this.deliveries = deliveryDtos;

        prev_branch = new BranchDto(courier.getPrev_branch());
        next_branch = new BranchDto(courier.getNext_branch());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DeliveryDto> getDeliveries() {
        return deliveries;
    }


    public void setDeliveries(List<DeliveryDto> deliveries) {
        this.deliveries = deliveries;
    }

    public int getHome_branch_index() {
        return home_branch_index;
    }

    public void setHome_branch_index(int home_branch_index) {
        this.home_branch_index = home_branch_index;
    }

    public BranchDto getPrev_branch() {
        return prev_branch;
    }

    public void setPrev_branch(BranchDto prev_branch) {
        this.prev_branch = prev_branch;
    }

    public BranchDto getNext_branch() {
        return next_branch;
    }

    public void setNext_branch(BranchDto next_branch) {
        this.next_branch = next_branch;
    }


    @Override
    public String toString() {
        return "Courier{" +
                ", name='" + name + '\'' +
                ", home_branch_index=" + home_branch_index +
                ", prev_branch=" + prev_branch +
                ", next_branch=" + next_branch +
                '}';
    }
}