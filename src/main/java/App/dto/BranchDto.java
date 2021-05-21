package App.dto;

import App.model.Branch;


import javax.persistence.*;
import java.util.Objects;

public class BranchDto
{

    private String name;

    private String address;



    public BranchDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public BranchDto(Branch branch) {
        this.name = branch.getName();
        this.address = branch.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Branch{" +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}